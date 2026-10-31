package com.isaachome.study.creation;

public class Main {
    static void main() throws InterruptedException {
        // create a thread
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // code that runs in a new thread
                System.out.println("We are in a thread" + Thread.currentThread().getName());
                System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
            }
        });
        // to give thread a name
        thread.setName("New Worker Thread");

        // setting a thread priority
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println("We are in main thread" + Thread.currentThread().getName() + " before starting a new thread");
        // start the thread
        thread.start();
        System.out.println("We are in main thread" + Thread.currentThread().getName() + " after starting a new thread");

        // thread sleep
        Thread.sleep(10000);
    }
}
