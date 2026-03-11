package com.shann.workingwithgraphql.service;

import com.shann.workingwithgraphql.model.Author;

import java.util.List;

public interface AuthorService {
    public List<Author> findAllAuthors();

    Author save(Author author);
}
