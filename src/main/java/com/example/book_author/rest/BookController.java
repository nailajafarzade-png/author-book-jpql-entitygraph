package com.example.book_author.rest;


import com.example.book_author.dto.request.AuthorRequest;
import com.example.book_author.dto.request.BookRequest;
import com.example.book_author.dto.response.AuthorResponse;
import com.example.book_author.dto.response.BookResponse;
import com.example.book_author.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService service;

    @PostMapping
    public BookResponse save(@RequestBody BookRequest request){
        return service.save(request);
    }
    @GetMapping
    public List<BookResponse> findAll(){
        return service.findAllBooks();
    }
}
