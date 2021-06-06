package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.decorator.exampleTwo;

public class DeveloperDecorator implements Developer {

    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }

}
