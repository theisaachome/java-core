package com.isaachome.stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationFromMethodDemo {
    public static void main(String[] args) {
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
        Stream.generate(new Random()::nextInt).limit(10).forEach(System.out::println);
        IntStream.generate(new Random()::nextInt).limit(5).forEach(System.out::println);
    }
}
