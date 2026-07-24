package com.example.book_author.rest;

import com.example.book_author.dao.repository.AuthorRepository;
import com.example.book_author.dto.request.AuthorRequest;
import com.example.book_author.dto.response.AuthorResponse;
import com.example.book_author.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService service;

    @GetMapping("/{id}")
    public AuthorResponse findById(@PathVariable Long id){
        return service.findByAuthorId(id);
    }

    @PostMapping("/add")
    public AuthorResponse save(@RequestBody AuthorRequest request){
        return service.save(request);
    }
}
