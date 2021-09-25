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
}