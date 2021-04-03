package Servise;

import Repository.BookRepository;
import Repository.PublisherRepository;
import com.project.project.domain.Book;
import com.project.project.domain.Publisher;
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
