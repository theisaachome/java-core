package com.isaachome.study.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CaseStudy {
    public static final int MAX_PASSWORD = 9999;

    static void main() {
        var random = new Random();
        var vault = new Vault(random.nextInt(MAX_PASSWORD));

        List<Thread> hackers = new ArrayList<>();
        hackers.add(new AscendingHackerThread(vault));
        hackers.add(new DescendingHackerThread(vault));
        hackers.add(new PolicaThread());
        hackers.forEach(Thread::start);
        
    }

    private static class Vault {
        private int password;

        public Vault(int password) {
            this.password = password;
        }

        public boolean isCorrectPassword(int guess) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {

            }
            return this.password == guess;
        }
    }

    private static abstract class HackerThread extends Thread {
        protected Vault vault;

        public HackerThread(Vault vault) {
            this.vault = vault;
            this.setName(this.getClass().getSimpleName());
            this.setPriority(Thread.MAX_PRIORITY);
        }

        @Override
        public void start() {
            System.out.println("Starting thread " + this.getName());
            super.start();
        }
    }

    private static class AscendingHackerThread extends HackerThread {
        public AscendingHackerThread(Vault vault) {
            super(vault);
        }

        @Override
        public void run() {
            for (int guess = 0; guess < MAX_PASSWORD; guess++) {
                if (this.vault.isCorrectPassword(guess)) {
                    System.out.println(this.getName() + " guessed password " + guess);
                    System.exit(0);
                }
            }
        }
    }

    private static class DescendingHackerThread extends HackerThread {
        public DescendingHackerThread(Vault vault) {
            super(vault);
        }

        @Override
        public void run() {
            for (int guess = MAX_PASSWORD; guess > 0; guess--) {
                if (this.vault.isCorrectPassword(guess)) {
                    System.out.println(this.getName() + " guessed password " + guess);
                    System.exit(0);
                }
            }
        }
    }

    private static class PolicaThread extends Thread {
        // wait for a signal from the vault 10 seconds
        @Override
        public void run() {
            for (int i = 10; i > 0; i--) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                System.out.println(i + " seconds left");
            }
            System.out.println("Game over for you hackers");
            System.exit(0);
        }
    }
}
