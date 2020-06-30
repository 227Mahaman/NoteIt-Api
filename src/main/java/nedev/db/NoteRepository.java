package nedev.db;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import nedev.model.Note;
import nedev.model.Notebook;

public interface NoteRepository extends JpaRepository<Note, Long> {

	//public Page<Note> 
	public List<Note> findAllByNotebook(Notebook notebook);
}
