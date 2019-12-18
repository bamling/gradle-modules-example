package com.github.bamling.examples.module2;

import com.github.bamling.examples.module1.Something;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomethingElseTest {

    @Mock
    private Something something;

    @Test
    void doSomething() {
        when(something.getSomething()).thenReturn("somethingElse");

        final SomethingElse somethingElse = new SomethingElse(something);
        assertEquals("somethingElse", somethingElse.getSomething());
    }
}