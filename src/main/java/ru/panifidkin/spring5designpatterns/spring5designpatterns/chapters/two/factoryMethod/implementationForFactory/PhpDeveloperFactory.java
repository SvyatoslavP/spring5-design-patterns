package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod.implementationForFactory;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod.abstractEntity.Developer;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod.abstractEntity.DeveloperFactory;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod.implementationForEntity.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
