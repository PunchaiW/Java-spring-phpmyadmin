package com.minecode.hello.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.minecode.hello.Models.Book;
import com.minecode.hello.Repo.BookRepo;

@RestController
public class ApiControllers {

    @Autowired
    private BookRepo bookRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value = "/books")
    public List<Book> getName(){
        return bookRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveBook(@RequestBody Book book){
        bookRepo.save(book);
        return "Saved...";
    }

    @PutMapping(value = "update/{id}")
    public String updateBook(@PathVariable long id, @RequestBody Book book){
        Book updateBook =bookRepo.findById(id).get();
        updateBook.setName(book.getName());
        updateBook.setDiscription(book.getDiscription());
        updateBook.setcost(book.getCost());
        bookRepo.save(updateBook);
        return "Updated...";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteBook(@PathVariable long id){
        Book deleteBook = bookRepo.findById(id).get();
        bookRepo.delete(deleteBook);
        return "Delete book with this id : "+id;
    }
}
