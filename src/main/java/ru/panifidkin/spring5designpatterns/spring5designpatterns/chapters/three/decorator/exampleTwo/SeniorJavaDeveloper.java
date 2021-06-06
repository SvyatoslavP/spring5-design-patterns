package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.three.decorator.exampleTwo;

public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return " +++++ Делаю обзор кода";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
