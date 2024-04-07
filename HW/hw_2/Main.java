package HW.hw_2;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.name = "Покупатель №1";
        Human human2 = new Human();
        human2.name = "Покупатель №2";
        Human human3 = new Human();
        human3.name = "Покупатель №3";

       
        Market market = new Market();

        System.out.println("_______________________________________________________________");
        System.out.println();
        System.out.println(" Имитация поведения покупателей в пункте выдачи заказов 'OZON'");
        System.out.println("_______________________________________________________________");
        System.out.println();

        market.acceptToMarket(human1);
        market.takeInQueue(human1);
        market.giveOrder();
        System.out.println();
        market.acceptToMarket(human2);
        market.takeInQueue(human2);
        System.out.println();
        market.takeOrder();
        market.releaseFromQueue();
        System.out.println();
        market.giveOrder();
        market.acceptToMarket(human3);
        market.takeInQueue(human3);
        market.releaseFromMarket(human1);
        market.update();
        System.out.println();
        

    }
}