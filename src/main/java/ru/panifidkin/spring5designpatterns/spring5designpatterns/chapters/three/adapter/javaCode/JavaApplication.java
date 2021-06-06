package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.adapter.javaCode;

public class JavaApplication {
    public void saveObject(){
        System.out.println("Сохраняю обьект");
    }

    public void updateObject(){
        System.out.println("Изменяю обьект");
    }

    public void loadObject(){
        System.out.println("Загружаю обьект");
    }

    public void deleteObject(){
        System.out.println("Удаляю обьект");
    }
}
