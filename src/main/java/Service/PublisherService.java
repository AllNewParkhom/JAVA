package Service;

import Repository.PublisherRepository;
import dto.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publisher> getAllBooks(){
        return publisherRepository.findAll();
    }

    void add(Publisher publisher){
        publisherRepository.add(publisher);
    }
}
