package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.banking;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.abstractEntity.Tester;

/**
 * QA тестер банковского приложения
 */
public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA тестер тестирует банковский код.....");
    }
}
