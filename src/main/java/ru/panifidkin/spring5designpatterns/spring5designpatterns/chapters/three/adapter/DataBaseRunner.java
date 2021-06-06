package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.adapter;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.adapter.unknownInterface.DataBase;

public class DataBaseRunner {

    public static void main(String[] args) {
        DataBase dataBase = new AdapterJavaToDataBase();

        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();

    }

}
