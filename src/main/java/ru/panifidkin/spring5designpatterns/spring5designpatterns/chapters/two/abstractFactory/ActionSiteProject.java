package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.website.WebsiteTeamFactory;

public class ActionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new WebsiteTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
