package com.shann.workingwithgraphql.resolver;

import com.shann.workingwithgraphql.model.Book;
import com.shann.workingwithgraphql.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookQueryResolver {

    private final BookService bookService;

    public BookQueryResolver(BookService bookService) {
        this.bookService = bookService;
     }

     @QueryMapping
     public List<Book> findAllBooks() {
         return bookService.findAll();
     }

    @QueryMapping
    public List<Book> booksByGenre(@Argument String genre) {
        return bookService.findByGenre(genre);
    }

}

