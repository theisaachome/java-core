package com.isaachome;

import com.isaachome.generics.GenericBox;
import com.isaachome.generics.GenericMethod;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GenericBox<String> myStringBox = new GenericBox<>("Hello From StringBox");
        System.out.println(myStringBox.getValue());
        GenericBox<Integer> myIntBox = new GenericBox<>(1);


    }
}
