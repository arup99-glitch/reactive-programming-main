package com.example.reactiveProgramming;

import org.springframework.boot.SpringApplication;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Palindrome {
    public static void main(String[] args) {
        String[] array = {"abcba", "arup", "aabbaa"};

        Flux.fromArray(array)
                .map(s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()))
                .subscribe(System.out::println);
    }
}
