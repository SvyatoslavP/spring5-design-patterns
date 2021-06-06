package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod;

import lombok.Data;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod.abstractEntity.Developer;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod.abstractEntity.DeveloperFactory;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod.implementationForEntity.PythonDeveloper;

/**
 * Без паттерна фабрика я бы в ручную создавал бы зависимость Developer
 * с паттерном я создаю через фабрику
 */
@Data
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
