package com.example.reactiveProgramming;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RotateElements {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};

        List<Integer> reversedList = Arrays.asList(numbers);
        Collections.reverse(reversedList);

        Flux.fromIterable(reversedList)
                .subscribe(System.out::println);


    }
}
