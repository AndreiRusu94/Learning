package com.learning.designpatterns.template;

public class StandardComputerBuilder extends ComputerBuilder {

    @Override
    public void addMotherboard() {
        getComputerParts().put("Motherboard", "Standard Motherboard");
    }

    @Override
    public void addProcessor() {
        getComputerParts().put("Processor", "Standard Processor");
    }
}
