package com.shann.workingwithgraphql.resolver;

import com.shann.workingwithgraphql.model.Book;
import com.shann.workingwithgraphql.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookQueryResolver {

    private final BookRepository bookRepository;

    public BookQueryResolver(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
     }

     @QueryMapping
     public List<Book> findAllBooks() {
         return bookRepository.findAll();
     }

    @QueryMapping
    public List<Book> booksByGenre(@Argument String genre) {
        return bookRepository.findByGenre(genre);
    }

}

