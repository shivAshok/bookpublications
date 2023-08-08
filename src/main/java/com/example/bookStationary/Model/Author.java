package com.example.bookStationary.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String authorName;
    @Enumerated(EnumType.STRING)
    Gender gender;
   int age;
   int rating;
  int noOfpagesWritten;
   @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    List<Book> bookList=new ArrayList<>();
   @OneToMany(mappedBy = "author",cascade=CascadeType.ALL)
    List<Publish> publishList=new ArrayList<>();

}
