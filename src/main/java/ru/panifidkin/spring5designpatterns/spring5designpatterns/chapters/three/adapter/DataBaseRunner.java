package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.adapter;

public class DataBaseRunner {

    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDataBase();

        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();

    }

}
