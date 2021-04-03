package com.project.project;

import Config.AppConfig;
import Config.DumbConfig;
import Repository.BookRepository;
import Servise.AuthorServise;
import Servise.BookService;
import Servise.DumbServise;
import com.project.project.domain.Author;
import com.project.project.domain.Book;
import component.DumbComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan(basePackageClasses = {DumbConfig.class,
        DumbServise.class,
        DumbComponent.class,
        //DumbRepository.class
        BookRepository.class
})
public class SampleApplication {
    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(SampleApplication.class);
        AppConfig applicationConfig = context.getBean(AppConfig.class);
        BookService bookService = context.getBean(BookService.class);

        List<Book> books = bookService.getAllBooks();

        AuthorServise authorService = context.getBean(AuthorServise.class);
        authorService.addBookToAu(books.get(0), "Pushkin");
        authorService.addBookToAu(books.get(1), "Pushkin");
        authorService.addBookToAu(books.get(2), "Tolstoy");

        List<Author> authors = authorService.getAllBooks();


        for (Book book: books){
            System.out.println(book.toString());
        }

        for (Author author: authors){
            System.out.println(author.toString());
        }

        assert  applicationConfig != null;
    }
}
