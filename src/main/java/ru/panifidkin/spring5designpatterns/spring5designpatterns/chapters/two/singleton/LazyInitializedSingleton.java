package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.singleton;

/**
 * Метод отложенной инициализации для реализации шаблона Singleton создает экземпляр в глобальном методе доступа.
 * Вот пример кода для создания класса Singleton с этим подходом.
 *
 * Вышеупомянутая реализация отлично работает в случае однопоточной среды,
 * но когда дело доходит до многопоточных систем, это может вызвать проблемы,
 * если несколько потоков находятся внутри условия if одновременно.
 * Это уничтожит одноэлементный шаблон, и оба потока получат разные экземпляры одноэлементного класса.
 * В следующем разделе мы увидим различные способы создания поточно-ориентированного одноэлементного класса.
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
