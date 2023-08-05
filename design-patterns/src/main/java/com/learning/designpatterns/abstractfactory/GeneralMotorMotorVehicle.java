package com.learning.designpatterns.abstractfactory;

public class GeneralMotorMotorVehicle implements MotorVehicle {

    @Override
    public void build() {
        System.out.println("GM motor vehicle");
    }
}
