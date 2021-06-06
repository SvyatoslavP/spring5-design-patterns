package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.prototype;

public class ProjectFactory {
    Project project;

    public ProjectFactory(Project project) {
        this.project = project;
    }

    Project cloneProject(){
        return (Project) project.copy();
    }
}
