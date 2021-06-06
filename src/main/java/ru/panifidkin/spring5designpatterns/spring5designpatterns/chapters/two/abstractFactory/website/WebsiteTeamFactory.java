package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.website;

import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.abstractEntity.Developer;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.abstractEntity.ProjectManager;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.abstractEntity.ProjectTeamFactory;
import ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.abstractFactory.abstractEntity.Tester;
/**
 * Фабрика для создания команды преднозначенной для website приложения
 */
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
