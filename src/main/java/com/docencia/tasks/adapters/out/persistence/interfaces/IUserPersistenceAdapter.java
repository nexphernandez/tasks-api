package com.docencia.tasks.adapters.out.persistence.interfaces;

import java.util.List;
import java.util.Optional;

import com.docencia.tasks.domain.model.User;

public interface IUserPersistenceAdapter {
    List<User> getAll();
    Optional<User> getById(Long id);
    boolean deleteById(Long id);
    User save(User user,String rol);
    User update(User user,String rol);
}
