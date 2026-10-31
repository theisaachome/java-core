package com.isaachome.study.example2;

public class Main {
    static void main() {
        var thread = new NewThread();
        thread.start();
    }

    private static class NewThread extends Thread {
        @Override
        public void run() {
            this.setName("New Thread");
            System.out.println("Hello from " + this.getName());
        }
    }
}

/*
Case Study
Safe box to hack Vault
 */