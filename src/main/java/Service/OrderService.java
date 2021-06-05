package Service;

import Repository.OrderRepository;
import dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllBooks(){
        return orderRepository.findAll();
    }

    void add(Order order){
        orderRepository.add(order);
    }
}
