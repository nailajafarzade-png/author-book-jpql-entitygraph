package com.example.book_author.dao.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;
    @Column(name="author_name")
    private String authorName;
    @OneToMany(mappedBy = "author")
    private List<Book> books;
}
