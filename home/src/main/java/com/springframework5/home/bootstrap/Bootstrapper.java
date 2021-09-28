package com.springframework5.home.bootstrap;

import com.springframework5.home.model.Author;
import com.springframework5.home.model.Book;
import com.springframework5.home.repositories.AuthorRepository;
import com.springframework5.home.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrapper implements CommandLineRunner {

    AuthorRepository authorRepository;
    BookRepository bookRepository;

    public Bootstrapper(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author();
        Book book = new Book();
        author.getBooks().add(book);
        book.getAuthors().add(author);
        authorRepository.save(author);
        bookRepository.save(book);
        System.out.println("saved Authors in H2 database: " +authorRepository.count());
        System.out.println("saved Books in H2 database: " +bookRepository.count());
    }
}
