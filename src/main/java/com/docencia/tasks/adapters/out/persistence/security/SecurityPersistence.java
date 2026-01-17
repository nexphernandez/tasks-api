package com.docencia.tasks.adapters.out.persistence.security;

import java.util.HashSet;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SecurityPersistence implements ISecurityPersistence {

    private final UserJpaRepository userJpa;

    public SecurityPersistence(UserJpaRepository userJpa) {
        this.userJpa = userJpa;
    }

    @Override
    public List<UserJpaEntity> getAll() {
        return userJpa.findAll();
    }

    @Override
    public UserJpaEntity getById(Long id) {
        return userJpa.findById(id).orElse(null);
    }

    @Override
    public boolean delete(UserJpaEntity user) {
        if (user == null || user.getId() == null) {
            return false;
        }
        userJpa.delete(user);
        return true;
    }

    @Override
    public UserJpaEntity save(UserJpaEntity user, RolJpaEntity rol) {
        if (user.getRoles() == null) {
            user.setRoles(new HashSet<>());
        }
        user.getRoles().add(rol);
        return userJpa.save(user);
    }

    @Override
    public UserJpaEntity update(UserJpaEntity user, RolJpaEntity rol) {
        UserJpaEntity existingUser = userJpa.findById(user.getId()).orElse(null);
        if (existingUser == null) {
            return null;
        }
        existingUser.setUserName(user.getUserName());
        existingUser.setPassword(user.getPassword());
        
        if (existingUser.getRoles() == null) {
            existingUser.setRoles(new HashSet<>());
        }
        existingUser.getRoles().add(rol);
    
        return userJpa.save(existingUser);
    }

}
