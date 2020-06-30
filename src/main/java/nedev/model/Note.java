package nedev.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String title;
    private String text;
    @ManyToOne(fetch = FetchType.LAZY)
    private Notebook notebook;
    private Date lastModifiedOn;
    
	/*
	 * protected Note() { this.id = UUID.randomUUID(); this.lastModifiedOn = new
	 * Date(); }
	 * 
	 * public Note(String title, String text, Notebook notebook) { this();
	 * this.title = title; this.text = text; this.notebook = notebook; }
	 * 
	 * public Note(String id, String title, String text, Notebook notebook) {
	 * this(title, text, notebook); if (id != null) { this.id = UUID.fromString(id);
	 * } }
	 */


	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Notebook getNotebook() {
		return notebook;
	}

	public void setNotebook(Notebook notebook) {
		this.notebook = notebook;
	}

	public Date getLastModifiedOn() {
		return lastModifiedOn;
	}

	public void setLastModifiedOn(Date lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	public Note(Long id, String title, String text, Notebook notebook, Date lastModifiedOn) {
		super();
		this.id = id;
		this.title = title;
		this.text = text;
		this.notebook = notebook;
		this.lastModifiedOn = lastModifiedOn;
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", title=" + title + ", text=" + text + ", notebook=" + notebook + ", lastModifiedOn="
				+ lastModifiedOn + "]";
	}    

}
