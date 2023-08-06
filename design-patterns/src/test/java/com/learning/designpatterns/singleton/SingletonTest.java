package com.learning.designpatterns.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class SingletonTest {

    @Test
    public void testSingletonCreation() {
        Singleton singleton = Singleton.getInstance();

        assertNotNull(singleton);

        Singleton secondSingletonReference = Singleton.getInstance();

        assertEquals(singleton, secondSingletonReference);
    }
}
