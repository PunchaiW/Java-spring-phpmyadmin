package com.minecode.hello.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minecode.hello.Models.Book;

public interface BookRepo extends JpaRepository<Book, Long>{
    
}
