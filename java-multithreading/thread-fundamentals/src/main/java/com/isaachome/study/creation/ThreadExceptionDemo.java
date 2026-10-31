package com.isaachome.study.creation;

public class ThreadExceptionDemo {
    static void main() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("Exception in thread");
            }
        });

        // set the uncaught exception handler to release the resources

        thread.setName("Misbehaviour thread");
        thread.setUncaughtExceptionHandler((t, e) -> System.out.println("Uncaught exception in thread " + t.getName()));
        // start the thread
        thread.start();
    }
}
