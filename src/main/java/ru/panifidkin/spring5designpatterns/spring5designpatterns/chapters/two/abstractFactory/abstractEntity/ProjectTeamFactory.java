package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.abstractEntity;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    ProjectManager getProjectManager();
    Tester getTester();
}
