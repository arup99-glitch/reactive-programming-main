package com.example.reactiveProgramming;

import reactor.core.publisher.Flux;

import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String input = "ArupChakraborty";
        Flux.fromArray(input.split(""))
                .groupBy(key -> key)
                .flatMap(groupedFlux -> groupedFlux.count()
                        .map(count -> Map.entry(groupedFlux.key(), count)))
                .collectMap(Map.Entry::getKey, Map.Entry::getValue)
                .subscribe(Frequency::printCharacterFrequencies);
    }

    private static void printCharacterFrequencies(Map<String, Long> characterFrequencies) {
        characterFrequencies.forEach((character, frequency) ->
                System.out.println("Character: " + character + ", Frequency: " + frequency));

    }
}
