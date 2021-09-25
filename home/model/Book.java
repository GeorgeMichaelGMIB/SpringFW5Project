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
	
}