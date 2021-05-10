package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod;

public class PythonDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
