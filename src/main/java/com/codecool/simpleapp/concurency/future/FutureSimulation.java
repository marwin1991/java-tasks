package com.codecool.simpleapp.concurency.future;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

public class FutureSimulation {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        List<Future<Integer>> tasks = new LinkedList<>();

        for(int i=0; i<10; i++) {
            LongTask longTask = new LongTask(10, 20);
            //Future<Integer> resultFuture = executor.submit(longTask::longCalc);

            FutureTask<Integer> futureTask = new FutureTask<>(() -> longTask.longCalc());
            //tasks.add(resultFuture);
        }

    }

    private static class LongTask{
        private final int a;
        private final int b;

        private LongTask(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int longCalc(){
            System.out.println("Started");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");
            return a + b;
        }

    }
}
