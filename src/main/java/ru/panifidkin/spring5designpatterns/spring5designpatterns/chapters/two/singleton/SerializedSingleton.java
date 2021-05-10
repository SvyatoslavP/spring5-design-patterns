package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.singleton;

import java.io.*;

/**
 *  Сериализация и синглтон
 *  Иногда в распределенных системах нам необходимо реализовать интерфейс Serializable
 *  в классе Singleton, чтобы мы могли сохранить его состояние в файловой системе
 *  и получить его в более поздний момент времени. Вот небольшой одноэлементный класс,
 *  который также реализует интерфейс Serializable.
 *
 *  Таким образом, он разрушает одноэлементный шаблон,
 *  чтобы преодолеть этот сценарий, все,
 *  что нам нужно для этого, обеспечить реализацию readResolve()метода.
 *  После этого вы заметите, что hashCode обоих экземпляров одинаков в тестовой программе
 */
public class SerializedSingleton implements Serializable{
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "B:\\text.txt"));
        out.writeObject(instanceOne);
        out.close();

        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "B:\\text.txt"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());

    }
}
