package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.builder.exampleOne;

import lombok.Getter;

@Getter
public abstract class WebsiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();

    abstract void buildCms();

    abstract void buildPrice();

}
