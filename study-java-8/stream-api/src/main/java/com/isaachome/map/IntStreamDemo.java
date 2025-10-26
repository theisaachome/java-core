package com.isaachome.map;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class IntStreamDemo {
    public static void main(String[] args) {
        // Create an IntStream of the first 5 positive integers
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);

        // Define an IntUnaryOperator that squares each element
        IntUnaryOperator mapper = x -> x * 2;

        // Use the map method to apply the operator to each element in the stream
        IntStream resultStream = intStream.map(mapper);

        // Print each element in the resulting stream
        resultStream.forEach(System.out::println);
    }
}
