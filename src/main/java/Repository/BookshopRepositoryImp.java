package Repository;

import dto.Book;
import dto.Bookshop;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookshopRepositoryImp implements BookshopRepository {
    private List<Bookshop> data = Arrays.asList(
            new Bookshop("Amital", 222222, new HashMap<Book, Integer>()),
            new Bookshop("ChitaiGorod", 2222223, new HashMap<Book, Integer>() )
    );

    @Override
    public List<Bookshop> findAll() {
        return data;
    }


    @Override
    public void add(Bookshop bookshop) {
        data.add(bookshop);
    }

    @Override
    public void delete(Bookshop bookshop) {
        data.removeIf(curr -> Objects.equals(curr.getUid(), bookshop.getUid()));

    }


    @Override
    public Bookshop findByUid(UUID uuid) {
        return data.stream().filter(curr -> Objects.equals(curr.getUid(), uuid)).findFirst().orElse(null);
    }
}
