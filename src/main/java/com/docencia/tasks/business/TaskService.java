package com.docencia.tasks.business;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.docencia.tasks.adapters.out.persistence.interfaces.ITaskPersistenceAdapter;
import com.docencia.tasks.business.interfaces.ITaskService;
import com.docencia.tasks.domain.model.Task;

@Service
public class TaskService implements ITaskService {

  private final ITaskPersistenceAdapter repo;

  public TaskService(ITaskPersistenceAdapter repo) {
    this.repo = repo;
  }

  @Override
  public Task create(Task task) {
    // Aseguramos alta nueva
    task.setId(null);
    return repo.save(task);
  }

  @Override
  public List<Task> getAll() {
    return repo.findAll();
  }

  @Override
  public Optional<Task> getById(Long id) {
    return repo.findById(id);
  }

  @Override
  public Optional<Task> update(Long id, Task patch) {
    return repo.findById(id).map(existing -> {
      if (patch.getTitle() != null) existing.setTitle(patch.getTitle());
      if (patch.getDescription() != null) existing.setDescription(patch.getDescription());
      // En esta implementación, completed siempre se actualiza con el valor de patch
      existing.setCompleted(patch.isCompleted());
      return repo.save(existing);
    });
  }

  @Override
  public boolean delete(Long id) {
    if (!repo.existsById(id)) return false;
    repo.deleteById(id);
    return true;
  }
}
