package com.codecool.simpleapp.string;

import java.util.ArrayList;
import java.util.HashMap;

public class StringSimulation {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("abc");
        a.append("bdf");

        for(int i=0; i<100; i++){
            a.append("A");
        }
        System.out.println(a.toString());
    }
}
