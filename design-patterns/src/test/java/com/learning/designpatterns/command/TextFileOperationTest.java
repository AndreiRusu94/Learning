package com.learning.designpatterns.command;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TextFileOperationTest {

    @Test
    public void testSaveFile() {
        TextFileOperationExecutor executor = new TextFileOperationExecutor();
        String output = executor.executeOperation(new SaveTextFileOperation(new TextFile("file1")));

        assertEquals("Saved file: file1", output);
    }

    @Test
    public void testOpenFile() {
        TextFileOperationExecutor executor = new TextFileOperationExecutor();
        String output = executor.executeOperation(new OpenTextFileOperation(new TextFile("file1")));

        assertEquals("Opened file: file1", output);
    }
}
