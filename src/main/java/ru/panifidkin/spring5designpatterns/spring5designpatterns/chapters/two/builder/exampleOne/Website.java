package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.builder.exampleOne;

import lombok.Setter;

@Setter
public class Website {
    private String name;
    private Cms cms;
    private int price;

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", price=" + price +
                '}';
    }
}
