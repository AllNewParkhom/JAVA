package Repository;

import com.project.project.domain.Book;
import com.project.project.domain.Category;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Repository
public class BookRepositoryImp implements BookRepository {
    private List<Book> data = Arrays.asList(
            new Book("skazki",523, 1986, 1990, 679, Category.ADVENTURE),
            new Book("stihi",28, 2000, 2010,1000 , Category.ART ),
            new Book("sobranie sochineniy",1374, 2011,2011,200,Category.FANTASY ),
            new Book("new book",107, 1999,2000,300,Category.ADVENTURE )
    );

    @Override
    public List<Book> findAll() {
        return data;
    }


    @Override
    public void add(Book book) {
        data.add(book);
    }

    @Override
    public void delete(Book book) {
        data.removeIf(curr -> Objects.equals(curr.getUid(), book.getUid()));

    }


    @Override
    public Book findByUid(UUID uuid) {
        return data.stream().filter(curr -> Objects.equals(curr.getUid(), uuid)).findFirst().orElse(null);
    }

}
