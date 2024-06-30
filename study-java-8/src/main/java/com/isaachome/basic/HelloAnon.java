package com.isaachome.basic;

import java.net.http.HttpClient;

interface Parameter{
    int sum(int a,int b);
}
public class HelloAnon {
    public static void main(String[] args) {
        Parameter param = new Parameter() {
            @Override
            public int sum(int a, int b) {
                return a*b;
            }
        };
        Parameter parameter = (a,b)-> {
            return a * b;
        };
        System.out.println(mul(parameter,2,4,5));

    }
    public  static  int mul(Parameter parameter,int a,int b,int c){
        return parameter.sum(a,b)*c;
    }
}
