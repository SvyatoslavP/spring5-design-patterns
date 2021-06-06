package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod.implementationForFactory;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod.abstractEntity.Developer;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod.abstractEntity.DeveloperFactory;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod.implementationForEntity.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
