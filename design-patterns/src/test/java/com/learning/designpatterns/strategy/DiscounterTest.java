package com.learning.designpatterns.strategy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class DiscounterTest {

    @Test
    public void testChristmasDiscounter() {
        int initialPrice = 100;
        BigDecimal discountedPrice = BigDecimal.valueOf(90.0);
        Discounter christmasDiscounter = Discounter.christmasDiscounter();

        assertEquals(discountedPrice, christmasDiscounter.applyDiscount(BigDecimal.valueOf(initialPrice)));
    }

    @Test
    public void testEasterDiscounter() {
        int initialPrice = 100;
        BigDecimal discountedPrice = BigDecimal.valueOf(50.0);
        Discounter easterDiscounter = Discounter.easterDiscounter();

        assertEquals(discountedPrice, easterDiscounter.applyDiscount(BigDecimal.valueOf(initialPrice)));
    }

}
