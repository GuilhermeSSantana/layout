package cadastro.pessoa.layout.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cadastro.pessoa.layout.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
 