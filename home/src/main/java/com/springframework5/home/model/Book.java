package com.springframework5.home.model;
import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Book{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String name;
	private String title;
	private String isbn;
	@ManyToMany
	@JoinTable(name="author_book", @JoinColumns=@JoinColumn("book_id"), 
	@inverseJoinColumn=@JoinColumn("author_id"))
	private ArrayList<Author> authors;
	
	@Override
	public boolean equals(Object o) {
		if(this == o)return true;
		if(o== null | getClass() != o.getClass()) return false;
		Book book = (Book) new Book();
		return id !=null? id.equals(book.id) : book.id==null;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode() != 0? id.hashCode():0;
	}
	
	
}