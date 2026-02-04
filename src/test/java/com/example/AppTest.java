package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    void testHello() {
        String expected = "Hello from Docker Java!";
        String actual = "Hello from Docker Java!";
        assertEquals(expected, actual);
    }
}
