package com.learning.designpatterns.observer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class NewsAgencyTest {

    @Test
    public void testNewsUpdates() {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.setNews("first");

        assertNull(observer.getNews());

        observable.addObserver(observer);
        observable.setNews("second");
        assertEquals("second", observer.getNews());
    }
}
