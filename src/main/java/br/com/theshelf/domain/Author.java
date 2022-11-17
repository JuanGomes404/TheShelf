package br.com.theshelf.domain;

import lombok.AllArgsConstructor;

import java.util.ArrayList;

@AllArgsConstructor
public class Author {
    public String name;
    ArrayList<Book> booksWrote;
}
