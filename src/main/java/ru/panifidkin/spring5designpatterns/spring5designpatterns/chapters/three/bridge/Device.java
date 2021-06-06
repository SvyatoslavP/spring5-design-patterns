package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.bridge;

/**
 * Общий интерфейс всех устройств
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
