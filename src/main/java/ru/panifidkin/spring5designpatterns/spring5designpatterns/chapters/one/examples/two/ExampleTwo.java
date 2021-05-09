package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.one.examples.two;

/**
 * Без паттерна фабрика я бы в ручную создавал бы зависимость Developer
 * с паттерном я создаю через фабрику
 */
public class ExampleTwo {
    private Developer developer;

    private DeveloperFactory developerFactory;

    public ExampleTwo(Developer developer) {
        this.developer = new PythonDeveloper();
    }

    public ExampleTwo(Developer developer, String name) {
        this.developer = developerFactory.createDeveloper();
    }

}
