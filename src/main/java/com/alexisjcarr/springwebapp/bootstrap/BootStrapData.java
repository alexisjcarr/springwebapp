package com.alexisjcarr.springwebapp.bootstrap;

import com.alexisjcarr.springwebapp.model.Author;
import com.alexisjcarr.springwebapp.model.Book;
import com.alexisjcarr.springwebapp.repositories.AuthorRepository;
import com.alexisjcarr.springwebapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noejb = new Book("J2EE Development Without EJB", "123456");
        rod.getBooks().add(noejb);
        noejb.getAuthors().add(rod);
        authorRepository.save(rod);
        bookRepository.save(noejb);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
    }
}
