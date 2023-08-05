package com.learning.designpatterns.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.Observable;
import java.util.Observer;

@Setter
@Getter
public class NewsChannel implements Observer {

    private String news;

    public void update(Observable o, Object news) {
        this.setNews((String) news);
    }

}
