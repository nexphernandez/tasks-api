package com.docencia.tasks.adapters.out.persistence.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RolJpaRepository extends JpaRepository<RolJpaEntity, Long>{
    Optional<RolJpaEntity> findByRol(String rol);
}
