package com.docencia.tasks.adapters.out.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docencia.tasks.adapters.out.persistence.jpa.TaskJpaEntity;

public interface TaskRepositoryRepository extends JpaRepository<TaskJpaEntity, Long> {
}
