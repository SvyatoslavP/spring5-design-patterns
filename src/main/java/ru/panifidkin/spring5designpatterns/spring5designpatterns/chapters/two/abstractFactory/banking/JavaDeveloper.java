package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.banking;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.Developer;

/**
 * Разработчик банковского приложения
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java разработчик пишет банковский код.....");
    }
}
