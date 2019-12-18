package com.github.bamling.examples.module1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomethingTest {

    @Test
    void getSomething() {
        assertEquals("something", new Something().getSomething());
    }
}