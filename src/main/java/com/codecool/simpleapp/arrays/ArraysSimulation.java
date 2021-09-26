package com.codecool.simpleapp.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArraysSimulation {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        long start = 0;
        IntStream.generate(() -> 1).forEach(elem -> {
            ints.add(elem);
        });
    }
}
