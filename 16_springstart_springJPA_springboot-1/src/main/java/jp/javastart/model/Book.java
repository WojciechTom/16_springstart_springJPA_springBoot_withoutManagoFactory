package jp.javastart.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Booksy")
public class Book implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private Long id;
	@Column(name = "book_isbn", length = 13, unique = true, nullable = false)
	private String isbn;
	@Transient
	private String title;
	@Column(name = "book_author")
	private String author;
	
	public Book() {}

	
	public Book(String isbn, String title, String author) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
	}
	
	
	
}
