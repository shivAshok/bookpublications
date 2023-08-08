package com.example.bookStationary.Controller;

import com.example.bookStationary.Model.Book;
import com.example.bookStationary.Service.BookService;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@FieldDefaults(level= AccessLevel.PRIVATE)
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/add-book")
    public  String addBook(@RequestBody Book book,@RequestParam int authorId){
        return bookService.addBook(book,authorId);
    }

}
