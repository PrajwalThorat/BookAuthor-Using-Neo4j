package com.stackroute.bookauthor.repository;

import com.stackroute.bookauthor.model.Author;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface AuthorRepository extends Neo4jRepository<Author,Integer> {
}
