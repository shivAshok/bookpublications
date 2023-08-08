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
public class Publish {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    int id;
    @OneToOne
    @JoinColumn
    Book book;

    @ManyToOne
    @JoinColumn
    Author author;
}
