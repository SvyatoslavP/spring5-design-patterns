package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.singleton;

/**
 * Реализация синглтона Билла Пью
 *  До Java 5 у модели памяти Java было много проблем,
 *  и описанные выше подходы приводили к сбою в определенных сценариях,
 *  когда слишком много потоков пытаются одновременно получить экземпляр класса Singleton.
 *  Таким образом, Билл Пью предложил другой подход к созданию класса Singleton
 *  с использованием внутреннего статического вспомогательного класса .
 *  Реализация Билла Пью Синглтона выглядит следующим образом;
 *
 *  Обратите внимание на частный внутренний статический класс,
 *  который содержит экземпляр одноэлементного класса.
 *  Когда загружается одноэлементный класс, SingletonHelper он не загружается в память,
 *  и только когда кто-то вызывает метод getInstance , этот класс загружается и создает экземпляр класса Singleton.
 *
 * Это наиболее широко используемый подход для класса Singleton,
 * поскольку он не требует синхронизации. Я использую этот подход во многих своих проектах,
 * и его также легко понять и реализовать.
 *
 */
public class BillPughSingleton {

    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
