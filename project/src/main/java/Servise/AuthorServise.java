package Servise;

import Repository.AuthorRepository;
import com.project.project.domain.Author;
import com.project.project.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class AuthorServise {

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
        HashSet<Book> books = author.getBookAu();
        books.add(book);
        author.setBookAu(books);
    }
}
