package com.example.bookStationary.Controller;

import com.example.bookStationary.Model.Author;
import com.example.bookStationary.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;

    @PostMapping("/add-Author")
    public String addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }

    @GetMapping("/find-maxpages-written")
    public List<String> findtheMaxpagesWrittenAuthor(){
        List<String> authors=authorService.getAuthorWithMaxPageswritten();
        return authors;
    }
}
