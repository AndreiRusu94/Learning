package com.learning.designpatterns.template;

public class HighEndComputerBuilder extends ComputerBuilder {

    @Override
    public void addMotherboard() {
        getComputerParts().put("Motherboard", "High-end Motherboard");
    }

    @Override
    public void addProcessor() {
        getComputerParts().put("Processor", "High-end Processor");
    }
}
