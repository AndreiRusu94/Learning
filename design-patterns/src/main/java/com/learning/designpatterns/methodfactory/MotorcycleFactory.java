package com.learning.designpatterns.methodfactory;

public class MotorcycleFactory extends MotorVehicleFactory {

    @Override
    public MotorVehicle createMotorVehicle() {
        return new Motorcycle();
    }
}
