package com.isaachome;

import java.io.PrintStream;
import java.text.NumberFormat;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {


        Employee emp = new Employee();
        System.out.println(emp.getId());
        var harry = new Employee();
        System.out.println(harry.getId());
        System.out.println(MyMath.PI);

        NumberFormat  currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(1000000));

        NumberFormat  percent = NumberFormat.getPercentInstance();
        System.out.println(percent.format(0.1));

        NumberFormat  us = NumberFormat.getInstance();
        System.out.println(us.format(1000000));

        NumberFormat  fr = NumberFormat.getInstance();
        System.out.println(fr.format(1000000));
    }
}

class Employee{
    private static Integer nextId=1;
    private Integer id;
    Employee(){
        id=nextId++;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}

class MyMath{
    public static final  double PI=3.14;
}