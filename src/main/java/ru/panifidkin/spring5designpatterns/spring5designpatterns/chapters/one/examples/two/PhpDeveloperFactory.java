package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.one.examples.two;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
