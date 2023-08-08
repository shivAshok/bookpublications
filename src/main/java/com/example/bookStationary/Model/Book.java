package com.example.bookStationary.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String bookName;
    String authorName;
    int pages;

    @OneToOne
    Publish publish;

    @ManyToOne
    @JoinColumn
    Author author;
}
