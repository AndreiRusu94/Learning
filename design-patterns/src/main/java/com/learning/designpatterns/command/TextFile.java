package com.learning.designpatterns.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextFile {

    private String name;

    public String openFile() {
        return "Opened file: " + name;
    }

    public String saveFile() {
        return "Saved file: " + name;
    }
}
