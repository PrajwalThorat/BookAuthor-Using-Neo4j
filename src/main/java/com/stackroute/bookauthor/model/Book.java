package com.stackroute.bookauthor.model;


import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;


@Node
public class Book {
    @Id
    private int id;
    private String name;
    private float price;
    private String authorname;
    
    
	public Book(int id, String name, float price, String authorname) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.authorname = authorname;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
    
    

}
