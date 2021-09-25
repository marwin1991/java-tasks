package com.codecool.simpleapp.concurency.calc;

public class Calculation implements Runnable{

    private int a;
    private int b;

    private boolean isFinished = false;
    private int result;

    public Calculation(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public void run() {
        System.out.println("String... " + Thread.currentThread().getId());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        result = a + b;
        isFinished=true;

        System.out.println("Stopping... " + Thread.currentThread().getId());
    }

public boolean isFinished() {
return isFinished;
}

public int getResult() {
return result;
}
}
