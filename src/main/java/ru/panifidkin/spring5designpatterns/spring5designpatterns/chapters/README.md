## Spring 5 Design Patterns глава 1
[Ссылка на проект](https://github.com/SvyatoslavP/spring5-design-patterns/tree/master/src/main/java/ru/panifidkin/spring5designpatterns/spring5designpatterns/chapters)
-----
*Ссылка на книгу [Ozon.com](https://www.ozon.ru/product/spring-vse-patterny-proektirovaniya-148640212/)*

Полезные упоминания:

* В основе интерфейса
###FactoryBean
из фреймворка Spring лежит паттерн проектирования «Абстрактная фабрика». Spring предоставляет множество реализаций данного интерфейса, например ProxyFactoryBean, JndiFactoryBean, LocalSessionFactoryBean, LocalContainerEntityManagerFactoryBean и т. д. Интерфейс FactoryBean также помогает Spring конструировать те объекты, которые фреймворк не может легко сконструировать сам.

Пример испольования паттерна фабричный метод
```
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
```
Пример испольования паттерна абстрактная фабрика
```
public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory teamFactory = new BankingTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
```
Пример испольования паттерна одиночка
остальные 7 примеров есть в коде.
Предоставляет контроллеру доступ к важнейшим (обычно с «тяжелыми» объектами) классам, например к классу соединения с базой данных и к классу
##SessionFactory в Hibernate;

```
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
```

## Другие полезные книги на эту тему
* [Spring Boot 2. Лучшие практики для профессионалов Гутьеррес Фелипе | Гутьеррес Фелипе](https://www.ozon.ru/context/detail/id/211432310/?asb=HlZ0mKEKmSkTW5wTMiT3ubd36ZzgIBto6Yg%252B5H2z%252BlY%253D&asb2=HlZ0mKEKmSkTW5wTMiT3ubd36ZzgIBto6Yg-5H2z-lY&keywords=spring)

* [Spring 5 для профессионалов | Козмина Юлиана, Харроп Роб](https://www.ozon.ru/context/detail/id/149092813/?asb=PaU4Vb0eY4ONxlfT7oQWPnf3bXtUEIbaeeUrXh2a7Ac%253D&asb2=PaU4Vb0eY4ONxlfT7oQWPnf3bXtUEIbaeeUrXh2a7Ac&keywords=spring)

* [Шаблоны корпоративных приложений | Ми Роберт, Фаулер Мартин](https://www.ozon.ru/product/shablony-korporativnyh-prilozheniy-147417586/?stat=YW5fMQ%3D%3D)

