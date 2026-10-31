package com.isaachome.study.coordination;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadJoinDemo {
    static void main() throws InterruptedException {
        List<Long> factors = Arrays.asList(10000000L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L);
        List<FactorialThread> threads = new ArrayList<>();

        for (Long inputNum : factors) {
            threads.add(new FactorialThread(inputNum));
        }
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            // if the thread is not done, wait for 2 seconds
            // then join the thread
            thread.join(2000);
        }
        for (int i = 0; i < threads.size(); i++) {
            FactorialThread thread = threads.get(i);
            if (thread.isDone()) {
                System.out.println("Factorial of " + thread.inputNum + " is " + thread.getResult() + ".");
            } else {
                System.out.println("The calculation for " + thread.inputNum + " is still in progress.");
            }
        }
    }

    private static class FactorialThread extends Thread {

        private final Long inputNum;
        private BigInteger result = BigInteger.ONE;
        private boolean isDone = false;

        public FactorialThread(Long inputNum) {
            this.inputNum = inputNum;
        }

        @Override
        public void run() {
            this.result = factorial(inputNum);
            this.isDone = true;
        }

        public BigInteger factorial(long num) {
            BigInteger tempResult = BigInteger.ONE;
            for (long i = num; i > 0; i--) {
                tempResult = tempResult.multiply(new BigInteger(String.valueOf(i)));
            }
            return tempResult;
        }

        public boolean isDone() {
            return isDone;
        }

        public BigInteger getResult() {
            return result;
        }
    }
}
