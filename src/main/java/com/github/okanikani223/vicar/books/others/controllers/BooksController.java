package com.github.okanikani223.vicar.books.others.controllers;

import com.github.okanikani223.vicar.books.others.controllers.dtos.Book;
import com.github.okanikani223.vicar.books.others.controllers.dtos.BookRegistrationInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Tag(name = "Books", description = "API to manage books you are reading on the Web, allowing access to book information, updated episodes, etc.")
@RequestMapping("/books")
@RestController
public class BooksController {

    @Operation(summary = "Register your book information", description = "Register books on the Web. If a book that has already been registered is entered, no registration will be made.", responses = {
            @ApiResponse(responseCode = "201", description = "If the book could be registered or was already registered"),
            @ApiResponse(responseCode = "400", description = "Incomplete information to be registered", content = @Content(schema = @Schema))
    })
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public BookRegistrationInfo save(@RequestBody Book book) {
        System.out.println(book);

        return new BookRegistrationInfo("00001");
    }

    @Operation(summary = "Retrieve information on all registered books", responses = {
            @ApiResponse(responseCode = "200", description = "Ok"),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema))
    })
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

    @Operation(summary = "Obtain information on the book with the specified ID", responses = {
            @ApiResponse(responseCode = "200", description = "Ok"),
            @ApiResponse(responseCode = "404", description = "Not found", content = @Content(schema = @Schema(implementation = Void.class)))
    })
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book get(@PathVariable String id) {
        return new Book(id, "aaaaaa", "url1", Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }
}
