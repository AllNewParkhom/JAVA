package Service;

import Repository.AuthorRepository;
import dto.Author;
import dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllBooks(){
        return authorRepository.findAll();
    }

    public void add(Author author){
        authorRepository.add(author);
    }

     public void addBookToAu(Book book, String name){
        Author author = authorRepository.findByName(name);
//        List<Book> books = author.getBookAu();
//        books.add(book);
//       author.setBookAu(books);
    }
}
