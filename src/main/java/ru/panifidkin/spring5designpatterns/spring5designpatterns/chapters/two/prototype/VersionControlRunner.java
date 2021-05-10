package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "superProject", "SourceCode source = new SourceCode();");
        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterClone = projectFactory.cloneProject();
//        Project masterClone = (Project) master.copy();
        System.out.println(masterClone);
        System.out.println(master == masterClone);
    }
}
