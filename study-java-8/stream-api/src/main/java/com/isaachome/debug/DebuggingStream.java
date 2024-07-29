package com.isaachome.debug;

import java.util.stream.Stream;

public class DebuggingStream {
    public static void main(String[] args) {
        int sum = Stream.of(1,2,3,4,5)
                .peek(e->System.out.println("Taking Integer : "+e))
                .filter(n ->n%2==1)
                .peek(e->System.out.println("Filtered Number: " + e))
                .map(n->n*n)
                .peek(e->System.out.println("Mapped Integer : " + e))
                .reduce(0,Integer::sum);
        System.out.println(sum);
    }

}
