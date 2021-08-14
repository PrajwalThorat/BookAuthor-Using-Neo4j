package com.stackroute.bookauthor.repository;

import com.stackroute.bookauthor.model.Book;

import org.springframework.data.neo4j.core.schema.Relationship;
import org.springframework.data.neo4j.core.schema.Relationship.Direction;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

public interface BookRepository extends Neo4jRepository<Book,Integer> {

    @Query("MATCH(a:Book {name: $bookName}),(b: Author {authorName: $authorName}) CREATE(a)-[:authored_by]->(b)")
    //mapping between neo4j between Book and Author
	
	
//	@Relationship(type="authored_by",direction = Direction.OUTGOING)
	public void bookAuthorRelationship(String bookName,String authorName);
}
