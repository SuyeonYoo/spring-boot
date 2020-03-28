package io.shc.suyeon.springboot.service;

import java.util.Optional;

import io.shc.suyeon.springboot.domain.Book;

public interface BookService {

	Optional<Book> findById(Long id);
}
