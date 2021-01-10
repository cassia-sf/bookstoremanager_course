package com.cassiafreitas.bookstoremanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //classe controladora Spring com suporte a Rest
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping
    public String hello() {
        return  "Hello Bookstore Manager";
    }
}
