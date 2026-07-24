package com.example.book_author.mapper;

import com.example.book_author.dao.entity.Book;
import com.example.book_author.dto.response.BookResponse;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public BookResponse toResponse(Book book) {
        return new BookResponse(book.getBookName(), book.getGenre(), book.getAuthor().getAuthorName());
    }
}