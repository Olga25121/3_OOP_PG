# Task 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования.

# Задание 1

<> Human extends

<> Actor protected String: name protected boolean: isMakeOrder protected boolean: isTakeOrder abstract String: getName() implements

<> ActorBehaviour void: setMakeOrder void: setTakeOrder boolean: isMakeOrder boolean: isTakeOrder

## Необходимо реализовать:
1. Интерфейс ActorBehavoir,
который будет содержать
описание возможных
действий актора в
очереди/магазине.

2. Абстрактный класс Actor,
который хранит в себе
параметры актора, включая
состояние готовности сделать
заказ и факт получения
заказа. Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих
“персональных данных” abstract.

3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir.

# Задание 2

<> Market implements

<> QueueBehaviour void: takeInQueue(Actor actor); void: takeOrders(); void: giveOrders(); void: releaseFromQueue();

<> MarketBehaviour void: acceptToMarket(Actor actor); void: releaseFromMarket(List actors); void: update();

## Необходимо реализовать строение классов, без конкретной реализации:

1. Интерфейс QueueBehaviour, который описывает
логику очереди – помещение в/освобождение из
очереди, принятие/отдача заказа.

2. Интерфейс MarketBehaviour, который описывает
логику магазина – приход/уход покупателей,
обновление состояния магазина.

3. Класс Market, который реализовывает два
вышеуказанных интерфейса и хранит в списке
список людей в очереди в различных статусах.

