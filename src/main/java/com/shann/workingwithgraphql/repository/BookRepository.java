package com.shann.workingwithgraphql.repository;

import com.shann.workingwithgraphql.model.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

  public List<Book> findByGenre(String genre);
}
