package com.codecool.simpleapp.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSimulation {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Piotr", "Ala", "Ma", "Kota", "test");
        Stream<String> nameStream= names.stream();

        Stream<Integer> nameLenStream = nameStream.map(name -> {
            System.out.println(name);
            return name.length();
        });

        System.out.println("HELLLOOOOO");


        List<Integer> result = nameLenStream.collect(Collectors.toList());
        System.out.println(result);

    }
}
