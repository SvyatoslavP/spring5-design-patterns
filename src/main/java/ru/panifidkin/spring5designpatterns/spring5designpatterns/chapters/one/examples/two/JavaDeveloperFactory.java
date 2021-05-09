package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.one.examples.two;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
