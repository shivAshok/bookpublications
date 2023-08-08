package com.example.bookStationary.Repository;

import com.example.bookStationary.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepo extends JpaRepository<Author,Integer> {

}
