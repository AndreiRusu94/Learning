package com.learning.designpatterns.strategy;

import java.math.BigDecimal;

public interface Discounter {
    BigDecimal applyDiscount(BigDecimal discount);

    static Discounter christmasDiscounter() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.9));
    }

    static Discounter easterDiscounter() {
        return amount -> amount.multiply(BigDecimal.valueOf(0.5));
    }
}
