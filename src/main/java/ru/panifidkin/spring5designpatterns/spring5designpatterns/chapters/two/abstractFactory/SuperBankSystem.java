package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.abstractEntity.Developer;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.abstractEntity.ProjectManager;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.abstractEntity.ProjectTeamFactory;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.abstractEntity.Tester;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new BankingTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
