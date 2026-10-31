package com.isaachome.study.example;

public class RaceConditionWithSynchronizedBlock {

    static void main() throws InterruptedException {
        // create objects
        RaceConditionWithSynchronizedBlock.InventoryCounter inventoryCounter = new RaceConditionWithSynchronizedBlock.InventoryCounter();
        RaceConditionWithSynchronizedBlock.DecrementingThread decrementingThread = new RaceConditionWithSynchronizedBlock.DecrementingThread(inventoryCounter);
        RaceConditionWithSynchronizedBlock.IncrementingThread incrementingThread = new RaceConditionWithSynchronizedBlock.IncrementingThread(inventoryCounter);

        incrementingThread.start();
        decrementingThread.start();

        incrementingThread.join();
        decrementingThread.join();

        System.out.println("Items in inventory: " + inventoryCounter.getItems());
    }

    public static class DecrementingThread extends Thread {
        private final RaceConditionWithSynchronizedBlock.InventoryCounter inventoryCounter;

        public DecrementingThread(RaceConditionWithSynchronizedBlock.InventoryCounter inventoryCounter) {
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
        private final RaceConditionWithSynchronizedBlock.InventoryCounter inventoryCounter;

        public IncrementingThread(RaceConditionWithSynchronizedBlock.InventoryCounter inventoryCounter) {
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
        public void increment() {
            synchronized (this) {
                this.items++;
            }
        }

        // synchronized method to ensure thread safety
        public synchronized void decrement() {
            synchronized (this) {
                this.items--;
            }
        }

        public int getItems() {
            return items;
        }
    }
}
