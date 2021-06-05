package com.project.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "order")
@Data
public class Order {
    @Id
    @Column(name = "orderId")
    private Integer orderId;
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "customerName")
    private String customerName;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "mail")
    private String mail;

//    @OneToMany(mappedBy = "order")
//    private Set<Book> books;

    @OneToMany(mappedBy = "order")
    private List<Book> films = new ArrayList<Book>();
}
