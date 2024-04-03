package HW.hw_1;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new HotDrink("Coffee Espresso", 250, 100, 95));
        productList.add(new HotDrink("Irish Coffee", 200, 200, 95));
        productList.add(new HotDrink("Hot Chocolate", 150, 150, 90));
        productList.add(new HotDrink("Black Tea", 200, 150, 85));
        productList.add(new HotDrink("Green Tea", 150, 150, 85));
        

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);

        
        System.out.println("_______________________________________________________________________");
        System.out.println();
        System.out.println(" ПОИСК ГОРЯЧИХ НАПИТКОВ ");
        System.out.println("_______________________________________________________________________");
        System.out.println();
        System.out.println(vendingMachine.getProduct("Coffee Espresso"));
        System.out.println();
        System.out.println(vendingMachine.getProduct("Irish Coffee"));
        System.out.println();
        System.out.println(vendingMachine.getProduct("Hot Chocolate"));
        System.out.println();
        System.out.println(vendingMachine.getProduct("Black Tea"));
        System.out.println();
        System.out.println(vendingMachine.getProduct("Green Tea"));
        System.out.println("_______________________________________________________________________");
        System.out.println();
    }
}

