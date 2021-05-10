# Spring 5 Design Patterns
## Spring 5 Design Patterns
### Spring 5 Design Patterns
[Ссылка](https://github.com/SvyatoslavP/spring5-design-patterns/tree/master/src/main/java/ru/panifidkin/spring5designpatterns/spring5designpatterns/chapters)
-----
*Ссылка на книгу [Ozon.com](https://www.ozon.ru/product/spring-vse-patterny-proektirovaniya-148640212/)*

Некоторый участок кода:
```
public class JdbcTransferRepository implements TransferRepository{
  JdbcTemplate jdbcTemplate;
  public setDataSource(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }
  // ...
}
```

## Другие полезные книги на эту тему
* [Spring Boot 2. Лучшие практики для профессионалов Гутьеррес Фелипе | Гутьеррес Фелипе](https://www.ozon.ru/context/detail/id/211432310/?asb=HlZ0mKEKmSkTW5wTMiT3ubd36ZzgIBto6Yg%252B5H2z%252BlY%253D&asb2=HlZ0mKEKmSkTW5wTMiT3ubd36ZzgIBto6Yg-5H2z-lY&keywords=spring)

* [Spring 5 для профессионалов | Козмина Юлиана, Харроп Роб](https://www.ozon.ru/context/detail/id/149092813/?asb=PaU4Vb0eY4ONxlfT7oQWPnf3bXtUEIbaeeUrXh2a7Ac%253D&asb2=PaU4Vb0eY4ONxlfT7oQWPnf3bXtUEIbaeeUrXh2a7Ac&keywords=spring)

* [Шаблоны корпоративных приложений | Ми Роберт, Фаулер Мартин](https://www.ozon.ru/product/shablony-korporativnyh-prilozheniy-147417586/?stat=YW5fMQ%3D%3D)
