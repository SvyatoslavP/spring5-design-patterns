package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.singleton;

import java.lang.reflect.Constructor;

/**
 *  Использование Reflection для уничтожения Singleton Pattern
 *  Отражение можно использовать
 *  для уничтожения всех вышеперечисленных подходов к реализации синглтонов.
 *  Давайте посмотрим на это на примере класса.
 *
 *  Когда вы запустите вышеуказанный тестовый класс,
 *  вы заметите, что hashCode обоих экземпляров не совпадает с тем,
 *  что разрушает одноэлементный шаблон.
 *  Отражение очень мощное средство и используется во многих фреймворках,
 *  таких как Spring и Hibernate, обязательно ознакомьтесь с Руководством по отражению Java .
 */
public class ReflectionSingletonTest {

    public static void main(String[] args) {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {

            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
