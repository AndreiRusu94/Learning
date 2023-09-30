package com.learning.designpatterns.facade;

import lombok.*;

@Data
public class CoolingController {

    private int temperature;

    public void run() {
        System.out.println("Temperature running at: " + temperature);
    }

    public void stop() {
        System.out.println("Stopped cooling");
    }
}
