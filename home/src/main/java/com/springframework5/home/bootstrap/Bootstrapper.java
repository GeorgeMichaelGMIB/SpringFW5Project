package com.springframework5.home.bootstrap;

import com.springframework5.home.model.Author;
import com.springframework5.home.model.Book;
import com.springframework5.home.model.Publisher;
import com.springframework5.home.repositories.AuthorRepository;
import com.springframework5.home.repositories.BookRepository;
import com.springframework5.home.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrapper implements CommandLineRunner {

    AuthorRepository authorRepository;
    BookRepository bookRepository;
    PublisherRepository publisherRepository;

    public Bootstrapper(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author author = new Author();
        Publisher publisher = new Publisher();
        Book book = new Book();
        author.getBooks().add(book);
        book.getAuthors().add(author);
        publisher.getBooks().add(book);
        authorRepository.save(author);
        publisherRepository.save(publisher);
        bookRepository.save(book);
        System.out.println("saved Authors in H2 database: " +authorRepository.count());
        System.out.println("saved Books in H2 database: " +bookRepository.count());
        System.out.println("saved Publishers in H2 database: " +publisherRepository.count());
    }
}
