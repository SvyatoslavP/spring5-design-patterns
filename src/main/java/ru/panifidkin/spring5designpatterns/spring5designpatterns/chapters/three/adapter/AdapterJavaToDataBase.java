package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.adapter;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.adapter.javaCode.JavaApplication;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.adapter.unknownInterface.DataBase;

public class AdapterJavaToDataBase extends JavaApplication implements DataBase {

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
