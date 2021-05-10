package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
