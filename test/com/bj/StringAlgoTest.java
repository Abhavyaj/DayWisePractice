package com.bj;

import static java.lang.System.out;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;


import org.junit.jupiter.api.Test;

class StringAlgoTest {
 @BeforeAll
public static void BeforeAll() {
 }
 @AfterAll
 public static void AfterAll() {
 	System.out.println("after all test close db connection");
 }
 
    @Test
    void testShift2Char_NormalCase() {
        StringAlgo obj = new StringAlgo();
        String input = "Hello";
        String expected = "lloHe";
        String actual = obj.shift2Chars(input);
        assertEquals(expected, actual);
        out.println(actual);
    }

    @Test
    void testShift2Char_AnotherCase() {
        StringAlgo obj = new StringAlgo();
        String input = "Java";
        String expected = "vaJa";
        String actual = obj.shift2Chars(input);
        assertEquals(expected, actual);
        out.println(actual);
    }
    
    @Test
    void testFromDB() {
        StringAlgo obj = new StringAlgo();
        String expected = "From db value received";
        String actual = obj.getFromDB();
        assertEquals(expected, actual);
    }
    
}