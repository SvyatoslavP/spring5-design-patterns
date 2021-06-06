package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.linker;

import java.awt.*;

/**
 * Общий интерфейс фигур
 */
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}
