package com.shann.workingwithgraphql.repository;

import com.shann.workingwithgraphql.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {}
