package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.adapter;

public interface DataBase {
     void insert();
     void update();
     void select();
     void remove();
}
