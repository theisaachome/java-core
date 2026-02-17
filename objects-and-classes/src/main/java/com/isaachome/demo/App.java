package com.isaachome.demo;

import com.isaachome.demo.order.Complex;
import com.isaachome.demo.order.Person;
import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Employee[] staff = new Employee[5];
        staff[0] = new Employee("Carl Cracker",100.00, LocalDate.of(2010,10,10));
        staff[1] = new Employee("Carl Cracker",100.00, LocalDate.of(2010,10,10));
        staff[2] = new Employee("Carl Cracker",100.00, LocalDate.of(2010,10,10));
        staff[3] = new Employee("Carl Cracker",100.00, LocalDate.of(2010,10,10));

        new Person();

        var am = new Complex(10,10);
        System.out.println(String.format("Real %s Imaginary %s",am.realPart(),am.imaginaryPart()));
    }
}
