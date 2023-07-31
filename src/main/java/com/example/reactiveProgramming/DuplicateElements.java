package com.example.reactiveProgramming;
import reactor.core.publisher.Flux;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args){
        Integer[] array = {1, 2, 3, 4, 5,1,2,3};
        Flux.fromArray(array)
                .groupBy(i -> i)
                .flatMap(group -> group.skip(1))
                .distinct()
                .subscribe(System.out::println);
    }

}
