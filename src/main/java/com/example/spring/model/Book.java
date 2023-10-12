package com.example.spring.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Book {
    Long id;
    String title;
    String author;
    String isbn;
    BigDecimal price;
    String description;
    String coverImage;
}
