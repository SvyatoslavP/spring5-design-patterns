package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.website;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.Developer;

/**
 * Разработчик приложения для website
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php разработчик пишет сайт код....");
    }
}
