package ru.chori.bigsister.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class TestBigSisterApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestBigSisterApplication.class, args);
    }
}
