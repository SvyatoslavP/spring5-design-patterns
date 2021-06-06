package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.decorator.exampleTwo;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();
        System.out.println(developer.makeJob());
        System.out.println("---------------");

        Developer developerTwo = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println(developerTwo.makeJob());
        System.out.println("---------------");

        Developer developerThree = new JavaTeamLead(new JavaDeveloper());
        System.out.println(developerThree.makeJob());
        System.out.println("---------------");

        Developer developerFour = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));

        System.out.println(developerFour.makeJob());

    }
}
