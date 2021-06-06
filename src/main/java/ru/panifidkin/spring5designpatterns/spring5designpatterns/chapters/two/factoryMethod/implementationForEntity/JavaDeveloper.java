package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod.implementationForEntity;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod.abstractEntity.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeJavaCode() {
        System.out.println("Java Developer writes java Code");
    }
}
