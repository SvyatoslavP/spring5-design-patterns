package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.singleton;

/**
 * Реализация инициализации статического блока аналогична активной инициализации,
 * за исключением того, что экземпляр класса создается в статическом блоке,
 * который предоставляет возможность обработки исключений.
 *
 * И активная инициализация, и инициализация статического блока создают экземпляр еще до того,
 * как он будет использован, и это не лучшая практика для использования.
 * Итак, в следующих разделах мы узнаем, как создать класс Singleton,
 * поддерживающий отложенную инициализацию.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Исключение при создании экземпляра синглтона");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
