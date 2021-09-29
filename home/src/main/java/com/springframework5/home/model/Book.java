package com.springframework5.home.model;


import lombok.*;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long ISBN;
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name="book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private Set<Author> authors = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Publisher publisher;

}
