package com.stackroute.bookauthor.services;

import com.stackroute.bookauthor.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> getALl();
    Author getById(int id);
    Author addAuthor(Author author);
    void deleteAuthor(int id);
    Author updateAuthor(Author author);
}
