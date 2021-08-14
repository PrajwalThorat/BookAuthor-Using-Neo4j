package com.stackroute.bookauthor.services;

import com.stackroute.bookauthor.model.Author;
import com.stackroute.bookauthor.model.Book;
import com.stackroute.bookauthor.repository.AuthorRepository;
import com.stackroute.bookauthor.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
    BookRepository bookRepository;
    AuthorRepository authorRepository;

    @Autowired
    public BookServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book createBook(Book book) {
        // book is present or not
        // author node is present or not
        Author newAuthor = new Author(book.getAuthorname());
        authorRepository.save(newAuthor);
        bookRepository.save(book);
        bookRepository.bookAuthorRelationship(book.getName(),book.getAuthorname());
        return null;
    }
}
