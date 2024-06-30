package com.isaachome.stream;

import java.io.File;
import java.util.List;

public class StreamPlayground {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5);
        int sum = 0;
        for(int n:integerList){
             if(n % 2==1){
                 int square = n * n;
                 sum = sum + square;
             }
        }
        System.out.println(sum);
        int streamSum = integerList.stream().filter(num->num %2==1)
                .map( data -> data * data)
                .reduce(0,Integer::sum);
        System.out.println(streamSum);

    }
}
