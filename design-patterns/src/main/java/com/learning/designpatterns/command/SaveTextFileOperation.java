package com.learning.designpatterns.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SaveTextFileOperation implements TextFileOperation {

    private TextFile file;

    public String execute() {
        return file.saveFile();
    }
}
