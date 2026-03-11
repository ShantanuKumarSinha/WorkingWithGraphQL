package com.shann.workingwithgraphql.mutation;

import com.shann.workingwithgraphql.model.Author;
import com.shann.workingwithgraphql.model.Book;
import com.shann.workingwithgraphql.repository.AuthorRepository;
import com.shann.workingwithgraphql.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookMutationResolver {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookMutationResolver(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @MutationMapping
    public Book addBook(@Argument String title, @Argument String genre, @Argument String author) {
        Book book = new Book();
        book.setTitle(title);
        book.setGenre(genre);
        book.setAuthor(author);
        return bookRepository.save(book);
    }

    @MutationMapping
    public Author addAuthor(@Argument String name) {
        Author author = new Author();
        author.setName(name);
        return authorRepository.save(author);
    }
}
