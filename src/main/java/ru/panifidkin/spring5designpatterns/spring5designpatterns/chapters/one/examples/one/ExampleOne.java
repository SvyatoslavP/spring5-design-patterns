package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.one.examples.one;

/**
 * Согласно паттерну внедрения зависимостей
 * зависимости присваиваются объектам
 * при их создании фабрикой или третьей стороной.
 * При создании программного обеспечения
 * одной из лучших практик при проектировании
 * и разработке является program-to-interface (P2I).
 */
public class ExampleOne {

    private DependencyOne dependencyOne;
    private DependencyTwo dependencyTwo;

    public ExampleOne(DependencyOne dependencyOne, DependencyTwo dependencyTwo) {
        this.dependencyOne = dependencyOne;
        this.dependencyTwo = dependencyTwo;
    }
}
