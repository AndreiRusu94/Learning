package com.learning.designpatterns.abstractfactory;

public class GeneralMotorCorporation extends Corporation {

    @Override
    public MotorVehicle createMotorVehicle() {
        return new GeneralMotorMotorVehicle();
    }

    @Override
    public ElectricVehicle createElectricVehicle() {
        return new GeneralMotorElectricVehicle();
    }
}
