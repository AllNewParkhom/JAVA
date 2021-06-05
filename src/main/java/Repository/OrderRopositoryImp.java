package Repository;

import dto.Order;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class OrderRopositoryImp implements OrderRepository{
    private List<Order> data = Arrays.asList(
            new Order("Andry", 2322322, "dumbmail.com", new HashSet<>()),
            new Order("Danil", 2322322, "dumbmail.com", new HashSet<>()),
            new Order("Misha", 2322322, "dumbmail.com", new HashSet<>())
    );

    @Override
    public List<Order> findAll() {
        return data;
    }


    @Override
    public void add(Order order) {
        data.add(order);
    }

    @Override
    public void delete(Order order) {
        data.removeIf(curr -> Objects.equals(curr.getUid(), order.getUid()));

    }


    @Override
    public Order findByUid(UUID uuid) {
        return data.stream().filter(curr -> Objects.equals(curr.getUid(), uuid)).findFirst().orElse(null);
    }
}
