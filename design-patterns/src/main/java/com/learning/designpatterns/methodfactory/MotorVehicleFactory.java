package com.learning.designpatterns.methodfactory;

public abstract class MotorVehicleFactory {

    public MotorVehicle create() {
        MotorVehicle vehicle = createMotorVehicle();
        vehicle.build();
        return vehicle;
    }

    public abstract MotorVehicle createMotorVehicle();
}
