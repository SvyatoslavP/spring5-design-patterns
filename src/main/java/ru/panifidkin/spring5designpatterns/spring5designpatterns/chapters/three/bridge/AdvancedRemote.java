package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.bridge;

/**
 * Улучшенный пульт
 */
public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
