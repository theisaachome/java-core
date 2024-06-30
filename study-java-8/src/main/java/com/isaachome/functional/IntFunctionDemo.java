package com.isaachome.functional;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ToIntFunction;


//• IntFunction<R>
//• LongFunction<R>
//• DoubleFunction<R>
//• ToIntFunction<T>
//• ToLongFunction<T>
//• ToDoubleFunction<T>
public class IntFunctionDemo {
    public static void main(String[] args) {
        // Define an IntFunction that converts an integer to its square
        function1();
        function2();

    }

    static  void function1(){
        // create 2 functions
        Function<Integer,Integer> mainFunction = x-> x * x;
        Function<Integer,Integer> secondaryFunction = x -> x + 1;

        // Compose functions from the two functions
        Function<Integer,Integer> andThenFunction = mainFunction.andThen(secondaryFunction);
        Function<Integer,Integer> composeFunction =  secondaryFunction.compose(mainFunction);

        // Test the functions
        int num=5;
        System.out.println("Number : " + num);
        System.out.println("Square and then add one: " + andThenFunction.apply(num));
        System.out.println("Add one and Square :     " + composeFunction.apply(2));
    }
    static  void function2(){
        // Square the input, add one to the result, and square the result
        Function<Integer,Integer> chainedFunction = ((Function<Integer, Integer>)(x -> x * x))
                .andThen(x -> x+1)
                .andThen(x -> x * x);
        System.out.println(chainedFunction.apply(3));
    }

}
