package nedev.api;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nedev.db.NoteRepository;
import nedev.model.Note;
import nedev.model.Notebook;

@RestController
@RequestMapping("/api/notes")
@CrossOrigin
public class NoteController {
	
	@Autowired
	private NoteRepository noteRepository;
	
	@GetMapping("/all")
    public List<Note> all(){
		return noteRepository.findAll();
	}
	
	//@GetMapping("/byId/{id}")
	@RequestMapping("/all")
    public Note byId(@PathVariable Long id) {
		return noteRepository.findById(id).orElse(null);
	}
	
	//@GetMapping("/byNotebook/{notebookId}")
	@RequestMapping("/byNotebook/{notebookId}")
    public List<Note> byNotebook(@PathVariable Notebook notebook){
		return noteRepository.findAllByNotebook(notebook);
	}
	
	//@PostMapping("/save")
	@PostMapping("/save")
    public Note save(@RequestBody Note note) {
		noteRepository.saveAndFlush(note);
		return note;
	}
	
	@DeleteMapping("/api/notes/{id}")
    public void delete(@PathVariable Long id) {
		noteRepository.deleteById(id);
	}
}
