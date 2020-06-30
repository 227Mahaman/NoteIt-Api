package nedev.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Notebook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "notebook", cascade = CascadeType.ALL)
	//@JsonIgnore
	//private List<Note> notes;
	
	//protected Notebook() {
		
        //this.notes = new ArrayList<>();
    //}

    //public Notebook(String name) {
        //this();
        //this.name = name;
    //}

    //public Notebook(String id, String name) {
        //this();
        //if (id != null) {
            //this.id = UUID.fromString(id);
        //}
        //this.name = name;
    //}
	
	
	public String getName() {
		return name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*
	 * public List<Note> getNotes() { return notes; } public void
	 * setNotes(List<Note> notes) { this.notes = notes; }
	 */
	
	/*
	 * public int getNbOfNotes() { return this.notes.size(); }
	 */
	public Notebook() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*
	 * public Notebook(Long id, String name, List<Note> notes) { super(); this.id =
	 * id; this.name = name; this.notes = notes; }
	 * 
	 * @Override public String toString() { return "Notebook [id=" + id + ", name="
	 * + name + ", notes=" + notes + ", getName()=" + getName() + ", getId()=" +
	 * getId() + ", getNotes()=" + getNotes() + ", getNbOfNotes()=" + getNbOfNotes()
	 * + "]"; }
	 */
	public Notebook(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Notebook [id=" + id + ", name=" + name + "]";
	}
	
}
