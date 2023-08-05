package com.learning.designpatterns.methodfactory;

public class Motorcycle implements MotorVehicle {

    @Override
    public void build() {
        System.out.println("Build motorcycle");
    }
}
