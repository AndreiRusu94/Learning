package com.learning.designpatterns.methodfactory;

public class CarFactory extends MotorVehicleFactory {

    @Override
    public MotorVehicle createMotorVehicle() {
        return new Car();
    }
}
