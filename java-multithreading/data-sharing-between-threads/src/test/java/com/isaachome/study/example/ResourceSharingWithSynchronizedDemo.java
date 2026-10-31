package com.isaachome.study.example;

/*
 TextEditor is shared by multiple threads. such as UI thread and Saving thread.
 */
public class ResourceSharingWithSynchronizedDemo {

    static void main() throws InterruptedException {
        // create objects
        InventoryCounter inventoryCounter = new InventoryCounter();
        DecrementingThread decrementingThread = new DecrementingThread(inventoryCounter);
        IncrementingThread incrementingThread = new IncrementingThread(inventoryCounter);

        incrementingThread.start();
        decrementingThread.start();

        incrementingThread.join();
        decrementingThread.join();

        System.out.println("Items in inventory: " + inventoryCounter.getItems());
    }

    public static class DecrementingThread extends Thread {
        private final InventoryCounter inventoryCounter;

        public DecrementingThread(InventoryCounter inventoryCounter) {
            this.inventoryCounter = inventoryCounter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                this.inventoryCounter.decrement();
            }
        }
    }

    public static class IncrementingThread extends Thread {
        private final InventoryCounter inventoryCounter;

        public IncrementingThread(InventoryCounter inventoryCounter) {
            this.inventoryCounter = inventoryCounter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                this.inventoryCounter.increment();
            }
        }
    }

    private static class InventoryCounter {
        private int items = 0;

        // synchronized method to ensure thread safety
        // protects the critical section of code
        public synchronized void increment() {
            this.items++;
        }

        // synchronized method to ensure thread safety
        public synchronized void decrement() {
            this.items--;
        }

        public int getItems() {
            return items;
        }
    }
}
