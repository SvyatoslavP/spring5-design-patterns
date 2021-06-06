package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.decorator.exampleOne;

import java.io.IOException;

/**
 * Интерфейс, задающий базовые операции чтения и записи данных
 */
public interface DataSource {
    void writeData(String data) throws IOException;
    String readData();
}
