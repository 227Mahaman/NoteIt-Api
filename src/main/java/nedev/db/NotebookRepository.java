package nedev.db;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import nedev.model.Notebook;

public interface NotebookRepository extends JpaRepository<Notebook, Long> {

	//public List<Notebook> findAll();
}
