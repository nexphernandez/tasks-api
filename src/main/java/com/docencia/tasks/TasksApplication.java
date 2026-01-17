package com.docencia.tasks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.docencia.tasks.adapters.out.persistence.security.RolJpaEntity;
import com.docencia.tasks.adapters.out.persistence.security.RolJpaRepository;
import com.docencia.tasks.adapters.out.persistence.security.UserJpaEntity;
import com.docencia.tasks.adapters.out.persistence.security.UserJpaRepository;

@SpringBootApplication
public class TasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksApplication.class, args);
    }

    @Bean
    CommandLineRunner initAdmin(RolJpaRepository rolRepo, UserJpaRepository userRepo) {
        return args -> {
            RolJpaEntity adminRole = rolRepo.findByRol("ADMIN")
                    .orElseGet(() -> rolRepo.save(new RolJpaEntity(null, "ADMIN")));

            // Crear rol USER si no existe
            RolJpaEntity userRole = rolRepo.findByRol("USER")
                    .orElseGet(() -> rolRepo.save(new RolJpaEntity(null, "USER")));

            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

            // Crear usuario admin si no existe
            if (userRepo.findByUserName("admin").isEmpty()) {
                UserJpaEntity admin = new UserJpaEntity();
                admin.setUserName("admin");
                admin.setPassword(encoder.encode("admin123"));
                admin.getRoles().add(adminRole);
                userRepo.save(admin);
            }

            // Crear usuario normal si no existe
            if (userRepo.findByUserName("user").isEmpty()) {
                UserJpaEntity user = new UserJpaEntity();
                user.setUserName("user");
                user.setPassword(encoder.encode("user123"));
                user.getRoles().add(userRole);
                userRepo.save(user);
            }
        };
    }
}
