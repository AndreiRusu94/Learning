package com.learning.designpatterns.template;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ComputerBuilderTest {

    @Test
    public void testStandardComputerBuilder() {
        Map<String, String> computerParts =
                new StandardComputerBuilder()
                        .buildComputer()
                        .getComputerParts();

        assertEquals("Standard Motherboard", computerParts.get("Motherboard"));
        assertEquals("Standard Processor", computerParts.get("Processor"));
    }

    @Test
    public void testHighEndComputerBuilder() {
        Map<String, String> computerParts =
                new HighEndComputerBuilder()
                        .buildComputer()
                        .getComputerParts();

        assertEquals("High-end Motherboard", computerParts.get("Motherboard"));
        assertEquals("High-end Processor", computerParts.get("Processor"));
    }
}
