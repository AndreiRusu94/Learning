package com.learning.designpatterns.decorator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ChristmasTreeTest {

    @Test
    public void testChristmasTree() {
        ChristmasTree tree = new ChristmasTreeImpl();
        assertEquals("Christmas Tree", tree.decorate());
    }

    @Test
    public void testChristmasTreeWithLights() {
        ChristmasTree tree = new Lights(new ChristmasTreeImpl());
        assertEquals("Christmas Tree with lights", tree.decorate());
    }

    @Test
    public void testChristmasTreeWithLightsAndGarland() {
        ChristmasTree tree = new Garland(new Lights(new ChristmasTreeImpl()));
        assertEquals("Christmas Tree with lights with garland", tree.decorate());
    }
}
