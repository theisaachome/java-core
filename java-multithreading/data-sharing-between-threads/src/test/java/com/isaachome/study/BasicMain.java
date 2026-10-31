package com.isaachome.study;

public class BasicMain {
    static void main() {
        int x = 5;
        int y = 5;
        int result = new BasicMain().sum(x, y);
        System.out.println(result);
    }

    int sum(int x, int y) {
        return x + y;
    }
}
