package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.decorator.exampleTwo;

public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Пишет Java code";
    }
}
