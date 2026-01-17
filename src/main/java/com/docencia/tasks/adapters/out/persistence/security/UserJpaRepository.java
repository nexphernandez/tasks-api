
package com.docencia.tasks.adapters.out.persistence.security;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserJpaEntity, Long>{
    Optional<UserJpaEntity> findByUserName(String userName);
}
