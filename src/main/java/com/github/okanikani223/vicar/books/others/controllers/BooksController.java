package com.github.okanikani223.vicar.books.others.controllers;

import com.github.okanikani223.vicar.books.others.controllers.dtos.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BooksController {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Map<String, String> save(@RequestBody Book book) {
        System.out.println(book);

        return Map.of("id", "00001");
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAll() {
        return List.of(
                new Book("00001", "aaaaaa", "url1", Collections.emptyList(), Collections.emptyList(), Collections.emptyList()),
                new Book("00002", "bbbbbb", "url2", Collections.emptyList(), Collections.emptyList(), Collections.emptyList()),
                new Book("00003", "cccccc", "url3", Collections.emptyList(), Collections.emptyList(), Collections.emptyList()),
                new Book("00004", "ddddd", "url4", Collections.emptyList(), Collections.emptyList(), Collections.emptyList()),
                new Book("00005", "eeeee", "url5", Collections.emptyList(), Collections.emptyList(), Collections.emptyList())
        );
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book get(@PathVariable String id) {
        return new Book(id, "aaaaaa", "url1", Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }
}
