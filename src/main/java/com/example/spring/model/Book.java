package com.example.spring.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Book {
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private BigDecimal price;
    private String description;
    private String coverImage;
}
