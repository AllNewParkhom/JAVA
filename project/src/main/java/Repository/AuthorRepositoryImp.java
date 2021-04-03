package Repository;

import com.project.project.domain.Author;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class AuthorRepositoryImp implements AuthorRepository {
    private List<Author> data = Arrays.asList(
            new Author("Pushkin", new Date(-101,6,6), new HashSet<>()),
            new Author("Tolstoy", new Date(-72,9,9), new HashSet<>())

    );

    @Override
    public List<Author> findAll() {
        return data;
    }


    @Override
    public void add(Author author) {
        data.add(author);
    }

    @Override
    public void delete(Author author) {
        data.removeIf(curr -> Objects.equals(curr.getUid(), author.getUid()));

    }

    @Override
    public Author findByName(String name) {
        return data.stream().filter(curr -> Objects.equals(curr.getAuthorName(), name)).findFirst().orElse(null);
    }

    @Override
    public Author findByUid(UUID uuid) {
        return data.stream().filter(curr -> Objects.equals(curr.getUid(), uuid)).findFirst().orElse(null);
    }
}
