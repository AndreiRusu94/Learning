package com.learning.designpatterns.adapter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class IteratorAdapterTest {

    @Test
    public void testIteratorAdapter() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");

        Enumeration<String> enumeration = new Vector<>(list).elements();
        IteratorAdapter<String> iteratorAdapter = new IteratorAdapter<>(enumeration);

        assertTrue(iteratorAdapter.hasNext());
        assertEquals("first", iteratorAdapter.next());
    }
}
