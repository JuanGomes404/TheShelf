package br.com.theshelf.controller;


import br.com.theshelf.domain.Book;
import br.com.theshelf.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("books")
public class BookController {
    private final BookService bookService;

    @GetMapping("list")
    public List<Book> listAll(){
        return bookService.listAll();
    }
}
