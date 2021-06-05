package com.project.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "book")
@Data
public class Book {
    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long book_id;

    @Column(name = "page_count")
    private Integer pageCount;

    @Column(name = "yearOfPublishing")
    private Date yearOfPublishing;

    @Column(name = "realiseDate")
    private Date realiseDate;

    @Column(name = "price")
    private Integer price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_author")
    private Author author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_bookshop")
    private Bookshop bookshop;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_Category")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_order")
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_publisher")
    private Publisher publisher;

}
