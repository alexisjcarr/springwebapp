package com.alexisjcarr.springwebapp.repositories;

import com.alexisjcarr.springwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
