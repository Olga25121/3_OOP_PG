# Некоторые стандартные интерфейсы Java, примеры их использования и придание нового поведения своим типам.

## Iterator <E>
Итератор над «коллекцией». Iterator занимает место
Enumeration’в Java Collections Framework.

* hasNext()
* next()

## Iterable<E>
Позволяет собственному типу быть типом
оператора «for-each loop»

## Comparator<E>
Предназначен для упорядочивания собственных типов.
* obj.compare(x, y) <= 1
* obj.compare(x, y) <= 0
* obj.compare(x, y) <= -1

## Comparable<E>
Списки (и массивы) собственных типов позволяют автоматически
сортироваться при помощи:
* Collections.sort
* Arrays.sort 

## Comparable, equals, ==
Интерфейсов много

Cloneable
Serializable
*able и др.

«Заставить» работать стандартный функционал.
Работа со своими свои типы «как нужно».
Определить «свою» логику работы.



