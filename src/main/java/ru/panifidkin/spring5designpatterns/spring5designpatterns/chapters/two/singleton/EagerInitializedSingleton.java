package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.singleton;

/**
 * При активной инициализации экземпляр класса Singleton создается во время загрузки класса,
 * это самый простой способ создания класса singleton,
 * но у него есть недостаток,
 * заключающийся в том,
 * что экземпляр создается,
 * даже если клиентское приложение может его не использовать.
 *
 * Если ваш одноэлементный класс не использует много ресурсов,
 * используйте этот подход. Но в большинстве сценариев классы Singleton создаются для таких ресурсов,
 * как файловая система, подключения к базе данных и т. Д.
 * Мы должны избегать создания экземпляров до тех пор, пока клиент не вызовет getInstanceметод.
 * Кроме того, этот метод не предоставляет никаких опций для обработки исключений.
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
