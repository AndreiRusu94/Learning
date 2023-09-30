package com.learning.designpatterns.facade;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CarEngineFacadeTest {

    @Test
    public void testStartEngine() {
        CarEngineFacade carEngine = new CarEngineFacade();
        carEngine.startEngine();
        assertEquals(90, carEngine.getCoolingController().getTemperature());
    }

    @Test
    public void testStopEngine() {
        CarEngineFacade carEngine = new CarEngineFacade();
        carEngine.startEngine();
        carEngine.stopEngine();
        assertEquals(50, carEngine.getCoolingController().getTemperature());
    }
}
