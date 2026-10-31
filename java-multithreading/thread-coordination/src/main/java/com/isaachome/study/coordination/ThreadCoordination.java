package com.isaachome.study.coordination;


// Thread coordination
public class ThreadCoordination {
    static void main() {
        // thread termination
        // Thread.interrupted();
        // Daemon thread
        var myThread = new Thread(new BlockedThread());
        myThread.start();
        myThread.interrupt();
    }

    private static class BlockedThread implements Runnable {
        @Override
        public void run() {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                System.out.println("Exiting blocked thread");
            }
            System.out.println("Thread is blocked");
        }
    }
}
