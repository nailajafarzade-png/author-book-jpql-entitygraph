package com.example.book_author.dto.request;

import com.example.book_author.dao.entity.Author;

public record BookRequest(
        String bookName, String genre, Long authorId
) {
}
