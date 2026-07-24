package com.example.book_author.mapper;


import com.example.book_author.dao.entity.Author;
import com.example.book_author.dto.request.AuthorRequest;
import com.example.book_author.dto.response.AuthorResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper {
    public Author toEntity(AuthorRequest request){
        Author author = new Author();
        author.setAuthorName(request.authorName());
        return author;
    }
    public AuthorResponse toResponse(Author author){
        return new AuthorResponse(author.getAuthorId(),author.getAuthorName());
    }
}
