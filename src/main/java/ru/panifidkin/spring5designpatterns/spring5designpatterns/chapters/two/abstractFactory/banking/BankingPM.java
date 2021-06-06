package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.banking;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.abstractEntity.ProjectManager;

/**
 * Проект менеджер банковского приложения
 */
public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Банк манаджер управляет проектом банка.....");
    }
}
