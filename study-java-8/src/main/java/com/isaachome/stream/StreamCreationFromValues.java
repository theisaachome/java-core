package com.isaachome.stream;

import java.util.stream.Stream;

public class StreamCreationFromValues {
    public static void main(String[] args) {
//        createFromValue();
        fromBuilder();
    }
    static void createFromValue(){
        // 1
        Stream<String> nameStream = Stream.of("Hello Isaac");
        System.out.println(nameStream.toString());
        Stream<String> names = Stream.of("Ken", "Jeff", "Chris", "Ellen");
        names.forEach(System.out::println);

        Stream<Integer> numsStream = Stream.of(1,2,3,4,5,6);
       int sum= numsStream.filter(integer -> integer %2 ==1)
                .map(i->i*i)
                .reduce(0,Integer::sum);
        System.out.println(sum);
        String friends = "John,Peter,Luke,Mary";
        Stream<String> friendStream = Stream.of(friends.split(","));
        friendStream.forEach(System.out::println);
    }
    static  void fromBuilder(){
//        Stream.Builder<String> builder = Stream.builder();
        Stream.Builder<String> builder =  Stream.builder();
        var streams = builder
                .add("John")
                .add("Mary")
                .add("Petrucci")
                .add("Sky")
                .add("ManngPi")
                .build();
        streams.forEach(System.out::println);

    }
}
