package com.learning.designpatterns.template;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Map;

@AllArgsConstructor
@Getter
public class Computer {

    private Map<String, String> computerParts;
}
