package io.shc.suyeon.springboot.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.shc.suyeon.springboot.domain.Book;
import io.shc.suyeon.springboot.domain.BookRepository;

@Service
@Transactional
public class BookServiceimpl implements BookService {
	private final BookRepository bookRepository;
	
	public BookServiceimpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}


	@Override
	public Optional<Book> findById(Long id) {
		return bookRepository.findById(id);
	}

}
