package com.codecool.simpleapp.concurency.counter;

public class CounterUser implements Runnable {
    private final Counter counter;

    public CounterUser(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            counter.increment();
        }
    }
}
