package com.learning.designpatterns.facade;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class FuelInjector {

    public void on() {
        System.out.println("Fuel injector turned on");
    }

    public void off() {
        System.out.println("Fuel injector turned off");
    }

    public void inject() {
        System.out.println("Injected fuel");
    }
}
