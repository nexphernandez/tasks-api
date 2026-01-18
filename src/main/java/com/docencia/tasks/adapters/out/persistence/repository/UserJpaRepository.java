
package com.docencia.tasks.adapters.out.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docencia.tasks.adapters.out.persistence.jpa.UserJpaEntity;

public interface UserJpaRepository extends JpaRepository<UserJpaEntity, Long>{
    Optional<UserJpaEntity> findByUserName(String userName);
}
