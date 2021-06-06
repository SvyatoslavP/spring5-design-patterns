package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.website;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.abstractEntity.ProjectManager;

/**
 * Проект менеджер приложения website
 */
public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Сайт манаджер управляет проектом сайта.........");
    }
}
