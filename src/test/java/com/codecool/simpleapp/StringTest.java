package com.codecool.simpleapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    public void givenNameAndSurName_whenConcat_thenResultsMaches(){
        //given:
        String name = "Piotr";
        String surName = "Zmilczak";
        String expected = "PiotrZmilczak";

        //when:
        String result = name.concat(surName);

        //then:
        Assertions.assertEquals(expected,  result);
    }
}
