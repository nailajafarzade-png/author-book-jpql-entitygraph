package com.example.book_author.service;

import com.example.book_author.dao.entity.Author;
import com.example.book_author.dao.repository.AuthorRepository;
import com.example.book_author.dto.request.AuthorRequest;
import com.example.book_author.dto.response.AuthorResponse;
import com.example.book_author.mapper.AuthorMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthorService {
    private final AuthorMapper mapper;
    private final AuthorRepository repository;

    public AuthorResponse save(AuthorRequest request){
        Author author = mapper.toEntity(request);
        Author result = repository.save(author);
        return mapper.toResponse(result);
    }

    public AuthorResponse findByAuthorId(Long id){
        Author author = repository.findById(id).orElseThrow();
        return mapper.toResponse(author);
    }
}
