package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.singleton;

/**
 * Чтобы преодолеть эту ситуацию с Reflection,
 * Джошуа Блох предлагает использовать Enum для реализации шаблона проектирования Singleton,
 * поскольку Java гарантирует, что любое значение enum создается только один раз в программе Java.
 * Поскольку значения Java Enum доступны во всем мире, синглтон тоже.
 * Недостаток в том, что тип enum несколько негибкий;
 * например, он не допускает ленивую инициализацию.
 *
 */
public enum EnumSingleton {
    INSTANCE;

    public static void doSomething(){
        //do something
    }
}
