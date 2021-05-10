package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.website;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.Developer;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.ProjectManager;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.ProjectTeamFactory;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }
}
