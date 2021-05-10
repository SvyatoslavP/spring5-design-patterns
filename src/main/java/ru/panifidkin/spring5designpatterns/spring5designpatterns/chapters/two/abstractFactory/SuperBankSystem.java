package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory;

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
