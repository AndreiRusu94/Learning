package com.learning.designpatterns.template;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public abstract class ComputerBuilder {

    private Map<String, String> computerParts = new HashMap<>();

    public final Computer buildComputer() {
        addMotherboard();
        addProcessor();
        return new Computer(computerParts);
    }

    public abstract void addMotherboard();
    public abstract void addProcessor();
}
