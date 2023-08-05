package com.learning.designpatterns.methodfactory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class CarFactoryTest {

    @Test
    public void testCarCreation() {
        CarFactory cf = new CarFactory();
        MotorVehicle vehicle = cf.create();
        assertNotNull(vehicle);
        assertTrue(vehicle instanceof Car);
    }

    @Test
    public void testMotorcycleCreation() {
        MotorcycleFactory mf = new MotorcycleFactory();
        MotorVehicle vehicle = mf.create();
        assertNotNull(vehicle);
        assertTrue(vehicle instanceof Motorcycle);
    }
}
