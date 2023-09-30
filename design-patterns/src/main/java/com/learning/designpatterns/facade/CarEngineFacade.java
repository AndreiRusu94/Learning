package com.learning.designpatterns.facade;

import lombok.Getter;

@Getter
public class CarEngineFacade {

    private static final int DEFAULT_COOLING_TEMP = 90;
    private static final int MIN_ALLOWED_TEMP = 50;
    private Starter starter = new Starter();
    private CoolingController coolingController = new CoolingController();
    private FuelInjector fuelInjector = new FuelInjector();

    public void startEngine() {
        fuelInjector.on();
        fuelInjector.inject();
        starter.start();
        coolingController.setTemperature(DEFAULT_COOLING_TEMP);
        coolingController.run();
    }

    public void stopEngine() {
        fuelInjector.off();
        coolingController.setTemperature(MIN_ALLOWED_TEMP);
        coolingController.stop();
    }
}
