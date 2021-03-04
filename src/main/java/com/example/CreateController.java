package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller("/create")
public class CreateController {
    @Inject BookRepository bookRepository;

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        var book = new Book();
        book.setTitle("The Stand");
        bookRepository.save(book);
        return "Hello World";
    }
}
