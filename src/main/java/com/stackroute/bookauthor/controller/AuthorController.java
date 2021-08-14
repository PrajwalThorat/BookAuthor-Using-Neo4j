package com.stackroute.bookauthor.controller;
import com.stackroute.bookauthor.model.Author;
import com.stackroute.bookauthor.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1")
@RestController
public class AuthorController {
    AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    ResponseEntity<?> getAllAuthor(){
        return new ResponseEntity<>(authorService.getALl(), HttpStatus.OK);
    }

    @GetMapping("/author/{id}")
    ResponseEntity<?> getAuthorById(@PathVariable int id ){
        return new ResponseEntity<>(authorService.getById(id),HttpStatus.OK);
    }

    @PostMapping("author")
    ResponseEntity<?> postAuthor(@RequestBody Author author){
        return new ResponseEntity<>(authorService.addAuthor(author),HttpStatus.ACCEPTED);
    }

    @PutMapping("/update")
    ResponseEntity<?> updateAuthor(@RequestBody Author author){
        return new ResponseEntity<>(authorService.updateAuthor(author),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/author/{id}")
    String deleteAuthor(@PathVariable int id ){
        authorService.deleteAuthor(id);
        return "Id "+ id+ " is deleted";
    }

}
