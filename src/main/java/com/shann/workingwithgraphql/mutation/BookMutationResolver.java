package com.shann.workingwithgraphql.mutation;

import com.shann.workingwithgraphql.model.Author;
import com.shann.workingwithgraphql.model.Book;
import com.shann.workingwithgraphql.service.AuthorService;
import com.shann.workingwithgraphql.service.BookService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookMutationResolver {

    private final BookService bookService;
    private final AuthorService authorService;

    public BookMutationResolver(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @MutationMapping
    public Book addBook(@Argument String title, @Argument String genre, @Argument String author) {
        Book book = new Book();
        book.setTitle(title);
        book.setGenre(genre);
        book.setAuthor(author);
        return bookService.save(book);
    }

    @MutationMapping
    public Author addAuthor(@Argument String name) {
        Author author = new Author();
        author.setName(name);
        return authorService.save(author);
    }
}
