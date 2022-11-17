package br.com.theshelf.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Book {
    public String title;
    public String publisher;
    public Author author;
    public int publishingYear;
    public int numberOfPages;

    //default value;
    public boolean read = false;



}
