package com.example.bookStationary.Service;

import com.example.bookStationary.Model.Author;
import com.example.bookStationary.Repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepo authorRepo;
    public String addAuthor(Author author) {
        Author saved=authorRepo.save(author);
        return saved.getAuthorName();
    }

    public List<String> getAuthorWithMaxPageswritten() {
        List<Author> authors=authorRepo.findAll();
        int max=-1;
        for(Author a:authors){
            if(a.getNoOfpagesWritten()>max){
                max=a.getNoOfpagesWritten();
            }
        }
        List<String> authorNames=new ArrayList<>();
        for(Author a:authors){
            if(a.getNoOfpagesWritten()==max) {
                authorNames.add(a.getAuthorName());
            }
        }
        return authorNames;
    }
}
