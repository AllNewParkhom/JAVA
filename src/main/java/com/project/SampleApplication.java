package com.project;

import Config.AppConfig;
import Config.DumbConfig;
import Repository.BookRepository;
import Service.AuthorService;
import Service.BookService;
import Service.DumbService;
import dto.Author;
import dto.Book;
import component.DumbComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ComponentScan(basePackageClasses = {DumbConfig.class,

        DumbService.class,
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

        AuthorService authorService = context.getBean(AuthorService.class);
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
