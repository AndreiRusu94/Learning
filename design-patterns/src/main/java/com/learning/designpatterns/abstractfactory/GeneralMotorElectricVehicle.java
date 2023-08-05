package com.learning.designpatterns.abstractfactory;

public class GeneralMotorElectricVehicle implements ElectricVehicle {

    @Override
    public void build() {
        System.out.println("GM electric vehicle");
    }
}
