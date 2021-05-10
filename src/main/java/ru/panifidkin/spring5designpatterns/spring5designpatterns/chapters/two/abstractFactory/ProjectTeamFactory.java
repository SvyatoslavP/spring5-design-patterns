package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    ProjectManager getProjectManager();
    Tester getTester();
}
