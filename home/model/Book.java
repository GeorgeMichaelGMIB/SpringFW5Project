import javax.persistence.GenerationType;

@Entity
@Data
public class Book{
	@Id
	@GeneratedType(strategy= GenerationType.AUTO)
	private Long id;
	private String name;
	private String title;
	private String isbn;
	@ManyToMany
	@JoinTable(name="author_book", @JoinColumns=@JoinColumn("book_id"), 
	@inverseJoinColumns=@JoinColumn("author_id"))
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
		return id.hashCode() != null id.hashCode():0;
	}
	
	
}