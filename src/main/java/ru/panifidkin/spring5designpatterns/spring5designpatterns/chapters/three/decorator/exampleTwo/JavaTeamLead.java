package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.decorator.exampleTwo;

public class JavaTeamLead extends DeveloperDecorator {
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return " +++++ Отчет клиенту";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
