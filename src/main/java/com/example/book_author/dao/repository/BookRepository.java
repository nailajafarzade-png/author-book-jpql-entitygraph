package com.example.book_author.dao.repository;

import com.example.book_author.dao.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("""
select b 
from Book b
join fetch b.author
""")   //book+author eyni sorguda
    List<Book> findAllBooks();
}
