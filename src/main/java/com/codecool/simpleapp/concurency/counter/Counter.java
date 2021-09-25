package com.codecool.simpleapp.concurency.counter;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private volatile int counter = 0;

    private Semaphore semaphore = new Semaphore(1);

    public void increment() {
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter += 1;
        semaphore.release();
    }

    public int getCounter() {
        return counter;
    }
}
