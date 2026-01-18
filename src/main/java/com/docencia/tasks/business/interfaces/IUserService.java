package com.docencia.tasks.business.interfaces;

import java.util.List;
import java.util.Optional;

import com.docencia.tasks.domain.model.User;

public interface IUserService {
  User create(User user,String rol);
  List<User> getAll();
  Optional<User> getById(Long id);
  Optional<User> update(Long id, User patch,String Rol);
  boolean delete(Long id);
}
