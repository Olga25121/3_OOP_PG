# Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм.

## Задача 1 - Абстракция
_______________________

Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы initProducts (List ) сохраняющий в себе список исходных продуктов и getProduct(String name).

## Задача 2 - Инкапсуляция
_______________________

Реализуйте конструкторы, get/set методы, постройте логику ТорговогоАвтомата на основе кода сделанного в предыдущем задании.

## Задача 3 - Наследование
_______________________

Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды), сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат).

## Задача 4 - Полиморфизм
_______________________

Переопределите метод toString для Товара, запустите программу, после этого переопределите для наследника этот метод, после запуска обратите внимание на изменение поведения.

Создайте перегруженный метод выдачи товара ТорговымАвтоматом дополнив дополнительным входным параметром (пример: getProduct(String name) выдающий товар по имени, создайте метод возвращающий товар по имени и какому-либо параметру товара getProduct(String name, int volume).