package com.isaachome.study.threadInterrupted;

import java.math.BigInteger;

public class Main {
    static void main() {
        var thread = new Thread(new LongComputationTaskThread(BigInteger.valueOf(2), BigInteger.valueOf(5)));
        thread.start();
    }

    private static class LongComputationTaskThread implements Runnable {
        private final BigInteger base;
        private final BigInteger power;

        public LongComputationTaskThread(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        @Override
        public void run() {
            System.out.printf("%d ^ %d = %d", base, power, power(base, power));
        }

        private BigInteger power(BigInteger base, BigInteger power) {
            BigInteger result = BigInteger.ONE;
            for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread interrupted");
                    return BigInteger.ZERO;
                }
                result = result.multiply(base);
            }

            return result;
        }
    }
}
