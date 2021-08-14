package com.stackroute.bookauthor.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;


import java.util.List;
//useing lombok
//Entity class in Neo4j
@Node
public class Author {
	
	
 
	public Author(String authorname2) {
		// TODO Auto-generated constructor stub
	}

	@Id
    private String authorName;

   // private List<Book> authorname;

}
