package com.isaachome.study.example;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedBlockReentrant {
    private final List<Runnable> tasks;

    /*
     * @param tasks to executed concurrently
     */
    public SynchronizedBlockReentrant(List<Runnable> tasks) {
        this.tasks = tasks;
    }

    /**
     * Executes all the tasks concurrently
     */
    public void executeAll() {
        List<Thread> threads = new ArrayList<>(tasks.size());

        for (Runnable task : tasks) {
            Thread thread = new Thread(task);
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.start();
        }
    }

    static void main() {
        List<Runnable> tasks = new ArrayList<>();
        SynchronizedBlockReentrant reentrant = new SynchronizedBlockReentrant(tasks);
        reentrant.executeAll();
    }
}
