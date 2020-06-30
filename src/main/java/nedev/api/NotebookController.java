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

import nedev.db.NotebookRepository;
import nedev.model.Notebook;


@RestController
@RequestMapping("/api/notebooks")
@CrossOrigin
public class NotebookController {

	@Autowired
	private NotebookRepository notebookRepository;
	
	@GetMapping("/all")
    public List<Notebook> all(){
		return notebookRepository.findAll();
	}
	
	@PostMapping("/save")
    public Notebook save(@RequestBody Notebook notebook) {
		notebookRepository.saveAndFlush(notebook);
		return notebook;
	}
	
	@DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
		notebookRepository.deleteById(id);
	}
}
