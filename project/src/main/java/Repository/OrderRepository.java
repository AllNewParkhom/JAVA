package Repository;

import com.project.project.domain.Order;

import java.util.List;
import java.util.UUID;

public interface OrderRepository {

    List<Order> findAll();

    Order findByUid(UUID uid);

    void add(Order order);

    void delete(Order order);

}
