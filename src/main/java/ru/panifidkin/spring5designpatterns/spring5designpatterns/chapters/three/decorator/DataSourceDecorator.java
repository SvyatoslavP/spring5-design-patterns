package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.decorator;

import java.io.IOException;

/**
 * Базовый декоратор
 */
public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) throws IOException {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
