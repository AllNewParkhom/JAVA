package Repository;

import com.project.project.domain.Author;
import com.project.project.domain.Book;

import java.util.List;
import java.util.UUID;

public interface AuthorRepository {
    List<Author> findAll();

    Author findByUid(UUID uid);

    void add(Author author);

    void delete(Author author);

    Author findByName(String name);

}
