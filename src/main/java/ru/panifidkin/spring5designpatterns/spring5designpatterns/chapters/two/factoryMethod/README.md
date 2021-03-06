## Паттерн Фабричный метод
Ниже представлены преимущества паттерна «Фабрика»:
* способствует слабому сцеплению между взаимодействующими компонентами или классами благодаря использованию интерфейсов вместо привязывания классов, относящихся к конкретному приложению, к коду последнего;
* позволяет получить вариант объекта класса, реализующего интерфейс, во время выполнения программы;
* жизненный цикл объекта управляется фабрикой, реализуемой этим паттерном.
  Паттерн проектирования «Фабрика» желательно использовать для решения следующих часто встречающихся проблем:
* чтобы избавить разработчика от бремени создания объектов и управления ими;
* во избежание тесного сцепления между взаимодействующими компонентами, поскольку компонент не может заранее знать, какие подклассы ему понадобится создать;
* чтобы избежать жестко зашитого кода создания объекта класса.

Реализация паттерна во фреймворке Spring.
Этот паттерн прозрачно используется во фреймворке Spring для реализации контейнеров Spring с помощью интерфейсов BeanFactory и ApplicationContext.
Контейнеры Spring на основе паттерна «Фабрика» создают компоненты Spring для приложений фреймворка и управляют жизненным циклом каждого из них.
Интерфейсы BeanFactory и ApplicationContext являются фабричными, а в Spring есть множество классов реализаций. Метод getBean() — фабричный, возвращающий соответствующие компоненты Spring.
