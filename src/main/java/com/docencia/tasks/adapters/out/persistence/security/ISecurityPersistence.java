package com.docencia.tasks.adapters.out.persistence.security;

import java.util.List;

public interface ISecurityPersistence {
    List<UserJpaEntity> getAll();
    UserJpaEntity getById(Long id);
    boolean delete(UserJpaEntity user);
    UserJpaEntity save(UserJpaEntity user,RolJpaEntity rol);
    UserJpaEntity update(UserJpaEntity user,RolJpaEntity rol);
}
