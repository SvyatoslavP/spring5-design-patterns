## Паттерн Прототип
Преимущества использования паттерна проектирования «Прототип» таковы:

* уменьшает время, необходимое для создания объектов, благодаря использованию прототипа;
* сокращает создание производных классов;
* добавляет и удаляет объекты во время выполнения;
* динамически задает настройки классов приложения.

Этот паттерн включает реализацию прототипного интерфейса в целях создания клона существующего объекта. Используется в случаях, когда непосредственное создание объекта требует значительных затрат ресурсов, например, когда объект создается после дорогостоящей операции с базой данных. Объект можно закэшировать, вернуть его клон при следующем запросе и обновлять базу по мере необходимости, уменьшая таким образом количество требуемых обращений к ней.