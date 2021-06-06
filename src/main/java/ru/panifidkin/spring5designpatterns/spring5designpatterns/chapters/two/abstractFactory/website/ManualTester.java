package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.website;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.abstractEntity.Tester;

/**
 * Manual тестер приложения website
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual тестер тестирует код сайта......");

    }
}
