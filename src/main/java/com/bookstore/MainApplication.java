package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    private final BookstoreService bookstoreService;

    public MainApplication(BookstoreService bookstoreService) {
        this.bookstoreService = bookstoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    ApplicationRunner init() {
        return args -> {

            bookstoreService.newAuthor();
            bookstoreService.selectUpdateDeleteAuthor();
        };
    }
}
/*
 * How To Setup JPA Callbacks

Description: This application is a sample of setting the JPA callbacks (Pre/PostPersist, Pre/PostUpdate, Pre/PostRemove and PostLoad).

Key points:

in entity, write callback methods and use the proper annotations
callback methods annotated on the bean class must return void and take no arguments
Output example:
 * 
 */
