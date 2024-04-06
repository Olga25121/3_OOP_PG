package Seminars.OOPLessonTwo.workshop;

import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    private List<Сustomer> actorList = new ArrayList<>();

    @Override
    public void giveOrders() {
        for (Сustomer actor : actorList) {
            if (actor.isMakeOrder) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил заказ");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Сustomer> relasedActors = new ArrayList<>();
        for (Сustomer actor : actorList) {
            if (actor.isTakeOrder()) {
                relasedActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket(relasedActors);
    }

    @Override
    public void takeInQueue(Сustomer actor) {
        actorList.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrders() {
        for (Сustomer actor : actorList) {
            if (!actor.isMakeOrder) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void acceptToMarket(Сustomer actor) {
        takeInQueue(actor);
        System.out.println(actor.getName() + " пришёл в магазин");
    }

    @Override
    public void releaseFromMarket(List<Сustomer> actors) {
        for (Сustomer actor : actors) {
            System.out.println(actor.getName() + " вышел из магазина");
            actorList.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}