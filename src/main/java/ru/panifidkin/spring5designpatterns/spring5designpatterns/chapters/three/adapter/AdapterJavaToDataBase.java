package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.adapter;

public class AdapterJavaToDataBase extends JavaApplication implements DataBase{

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
