package Repository;

import dto.Bookshop;

import java.util.List;
import java.util.UUID;

public interface BookshopRepository {
    List<Bookshop> findAll();

    Bookshop findByUid(UUID uid);

    void add(Bookshop bookshop);

    void delete(Bookshop bookshop);

}
