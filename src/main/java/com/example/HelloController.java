package com.example;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller("/hello")
public class HelloController {
    @Inject BookRepository bookRepository;

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        var book = bookRepository.findById(1L);
        return "Hello World" + book.get();
    }
}
