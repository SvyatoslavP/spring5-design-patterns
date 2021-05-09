package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.one.examples.two;

public class PythonDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
