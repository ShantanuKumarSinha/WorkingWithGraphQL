package com.shann.workingwithgraphql.service.impl;

import com.shann.workingwithgraphql.model.Book;
import com.shann.workingwithgraphql.repository.BookRepository;
import com.shann.workingwithgraphql.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

  private BookRepository bookRepository;

  public BookServiceImpl(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  @Override
  public List<Book> findAll() {
    return bookRepository.findAll();
  }

  @Override
  public List<Book> findByGenre(String genre) {
    return bookRepository.findByGenre(genre);
  }

  @Override
  public Book save(Book book) {
    return bookRepository.save(book);
  }
}
