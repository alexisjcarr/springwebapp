package com.alexisjcarr.springwebapp.repositories;

import com.alexisjcarr.springwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
