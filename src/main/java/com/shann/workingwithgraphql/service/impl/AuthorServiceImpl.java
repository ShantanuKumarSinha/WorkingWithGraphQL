package com.shann.workingwithgraphql.service.impl;

import com.shann.workingwithgraphql.model.Author;
import com.shann.workingwithgraphql.repository.AuthorRepository;
import com.shann.workingwithgraphql.service.AuthorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }
}
