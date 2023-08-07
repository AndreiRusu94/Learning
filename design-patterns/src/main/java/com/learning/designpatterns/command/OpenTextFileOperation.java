package com.learning.designpatterns.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OpenTextFileOperation implements TextFileOperation {

    private TextFile file;

    public String execute() {
        return file.openFile();
    }
}
