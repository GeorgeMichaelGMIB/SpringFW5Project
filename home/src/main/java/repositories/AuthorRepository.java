package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.springframework5.home.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
