package com.project.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lombok.Data;

@Entity
@Table(name = "publisher")
@Data
public class Publisher {
    @Id
    @Column(name = "id_publisher")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_publisher;

    @Column(name = "publisher_name")
    private String publisher_name;

    @OneToMany(mappedBy = "publisher")
    private List<Book> films = new ArrayList<Book>();

}
