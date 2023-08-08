package com.example.bookStationary.Service;

import com.example.bookStationary.Model.Author;
import com.example.bookStationary.Model.Book;
import com.example.bookStationary.Repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    AuthorRepo authorRepo;
    public String addBook(Book book, int authorId) {
        Author author=authorRepo.findById(authorId).get();
        book.setAuthor(author);
        book.setAuthorName(author.getAuthorName());
        author.getBookList().add(book);
        int pages=author.getNoOfpagesWritten()+book.getPages();
        author.setNoOfpagesWritten(pages);
        Author savedAuthor=authorRepo.save(author);
        return savedAuthor.getAuthorName();
    }
}
