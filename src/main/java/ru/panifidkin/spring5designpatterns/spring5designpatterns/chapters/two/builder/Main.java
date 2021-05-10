package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new VisitCardWebsiteBuilder());

        Website website = director.buildWebsite();

        System.out.println(website);

    }
}
