package com.project.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "bookshop")
@Data
public class Bookshop {
    @Id
    @Column(name = "bookshopId")
    private Integer bookshopId;
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "shopName")
    private String shopName;

    @Column(name = "shopPhone")
    private Integer shopPhone;

    @OneToMany(mappedBy = "bookshop")
    private List<Book> films = new ArrayList<Book>();

}
