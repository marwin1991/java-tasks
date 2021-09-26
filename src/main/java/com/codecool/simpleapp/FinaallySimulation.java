package com.codecool.simpleapp;

public class FinaallySimulation {
    public static void main(String[] args) {

        Test test = new Test();
        System.out.println("Start");
        Integer a = test.test();
        System.out.println(a);
        System.out.println("End");
    }

    private static class Test{

        public int test(){
            try{
                System.out.println("test");
                return 10;
            } catch (Exception e){
                return 5;
            } finally {
                System.out.println("finally test");
                //return 0;
            }
        }
    }
}
