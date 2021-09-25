package com.codecool.simpleapp.singleton;

public class SimpleSingleton {
    private static SimpleSingleton instance;

    private int counter = 0;

    private SimpleSingleton(){

    }

    public static SimpleSingleton getInstance(){
        if(instance == null){
            instance = new SimpleSingleton();
        }
        return instance;
    }

    public void increment(){
        counter += 1;
    }
}
