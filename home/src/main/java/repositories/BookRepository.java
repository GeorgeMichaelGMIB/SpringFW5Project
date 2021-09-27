package repositories;

import org.springframework.data.repository.CrudRepository;
import com.springframework5.home.model.Book;
public interface BookRepository extends CrudRepository<Book, Long> {

}
