package com.springframework5.home.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import lombok.Data;
import java.util.ArrayList;

@Entity
@Data
public class Author{
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String firstname;
	private String secondName;
	private String middleName;
	@ManyToMany(mappedBy="authors")
	private ArrayList<Book> books;
	
	
	@Override
	public boolean equals(Object o) {
		if(this == o)return true;
		if(o== null | getClass() != o.getClass()) return false;
		Author author = (Author) new Author();
		return id !=null? id.equals(author.id) : author.id==null;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode() != 0? id.hashCode():0;
	}
	
}