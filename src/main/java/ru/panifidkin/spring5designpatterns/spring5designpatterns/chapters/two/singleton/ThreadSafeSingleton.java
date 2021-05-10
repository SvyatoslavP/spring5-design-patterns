package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.singleton;

/**
 * Более простой способ создать потокобезопасный одноэлементный класс - синхронизировать метод глобального доступа ,
 * чтобы только один поток мог выполнять этот метод за раз. Общая реализация этого подхода похожа на приведенный ниже класс.
 * <p>
 * Нижеупомянутая реализация отлично работает и обеспечивает безопасность потоков,
 * но снижает производительность из-за затрат, связанных с синхронизированным методом,
 * хотя нам это нужно только для первых нескольких потоков,
 * которые могут создавать отдельные экземпляры (Читайте: Синхронизация Java ).
 * Чтобы избежать этих лишних накладных расходов каждый раз, используется принцип блокировки с двойной проверкой .
 * В этом подходе синхронизированный блок используется внутри условия if с дополнительной проверкой,
 * чтобы гарантировать, что создается только один экземпляр одноэлементного класса.
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /**
     * Следующий фрагмент кода предоставляет реализацию блокировки с двойной проверкой double checked locking (lazy).
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
