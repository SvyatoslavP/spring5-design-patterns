## Паттерн Адаптер
Преимущества использования
У использования паттерна проектирования «Адаптер» в приложении есть следующие положительные стороны:
* возможность взаимодействия между двумя или более несовместимыми объектами;
* этот паттерн способствует повторному использованию уже существующих в приложении более старых элементов функциональности.
Области применения
Паттерн «Адаптер» имеет смысл применять для решения проблем проектирования в следующих случаях:
* вам нужно воспользоваться существующим классом, интерфейс которого несовместим с вашими нуждами;
* вам хотелось бы создать в своем приложении повторно используемый класс, который должен взаимодействовать с классами с несовместимыми интерфейсами;
* необходимо использовать несколько уже существующих подклассов, однако адаптировать их интерфейсы, создавая производные подклассы от каждого из них, нецелесообразно. Лучше применить адаптер объектов для подгонки интерфейса родительского класса.

Реализация паттерна во фреймворке Spring
Паттерн «Адаптер» повсеместно используется в Spring для прозрачной реализации множества различных элементов функциональности. Ниже представлены несколько основанных на этом паттерне классов из фреймворка:
* JpaVendorAdapter;
* HibernateJpaVendorAdapter;
* HandlerInterceptorAdapter;
* MessageListenerAdapter;
* SpringContextResourceAdapter;
* ClassPreProcessorAgentAdapter;
* RequestMappingHandlerAdapter;
* AnnotationMethodHandlerAdapter;
* WebMvcConfigurerAdapter.