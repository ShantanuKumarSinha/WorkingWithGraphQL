package com.shann.workingwithgraphql.service;

import com.shann.workingwithgraphql.model.Book;

import java.util.List;

public interface BookService {

    public List<Book> findAll();

    public List<Book> findByGenre(String genre);

    Book save(Book book);
}
