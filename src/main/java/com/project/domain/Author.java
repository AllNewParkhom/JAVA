package com.project.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "author")
@Data
public class Author {
    @Id

    @Column(name = "au_id")
    private Integer au_id;
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "authorName")
    private String authorName;

    @Column(name = "dateOfBirth")
    private Date dateOfBirth;

    @OneToMany(mappedBy = "author")
    private List<Book> books = new ArrayList<Book>();

//    public List<Book> getBookAu() {
//        return books;
//    }
}
