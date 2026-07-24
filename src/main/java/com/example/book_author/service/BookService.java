package com.example.book_author.service;

import com.example.book_author.dao.entity.Author;
import com.example.book_author.dao.entity.Book;
import com.example.book_author.dao.repository.AuthorRepository;
import com.example.book_author.dao.repository.BookRepository;
import com.example.book_author.dto.request.BookRequest;
import com.example.book_author.dto.response.BookResponse;
import com.example.book_author.mapper.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final BookMapper mapper;

    public BookResponse save(BookRequest request){
        Author author=authorRepository.findById(request.authorId()).orElseThrow();
        Book book=new Book();
        book.setAuthor(author);
        book.setBookName(request.bookName());
        book.setGenre(request.genre());
        return mapper.toResponse(bookRepository.save(book));
    }

    public List<BookResponse> findAllBooks(){
        return bookRepository.findAllBooks().stream().map(mapper::toResponse).toList();
    }

}
