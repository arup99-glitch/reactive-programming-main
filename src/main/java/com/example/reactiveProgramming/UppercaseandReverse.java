package com.example.reactiveProgramming;

import reactor.core.publisher.Flux;

public class UppercaseandReverse {
    public static void main(String[] args) {
        String[] array = {"spring", "flux", "mono"};

        Flux.fromArray(array)
                .map(String::toUpperCase)
                .map(s -> new StringBuilder(s).reverse().toString())
                .subscribe(System.out::println);
    }
}
