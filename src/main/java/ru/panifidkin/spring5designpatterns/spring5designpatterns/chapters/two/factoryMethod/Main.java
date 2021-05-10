package ru.panifidkin.spring5designpatterns.spring5designpatterns.chapters.two.factoryMethod;

public class Main {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");

        Developer developer = developerFactory.createDeveloper();
        developer.writeJavaCode();
    }

   public static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("python")) {
            return new PythonDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
    }
