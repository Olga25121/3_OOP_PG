package Seminars.OOPLessonOne;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // BottleOfWater b = new BottleOfWater(123, "123", 1);
        // System.out.println(b);

        List<Product> productList = new ArrayList<>();

        // productList.add(new BottleOfWater(50, "qwe", 100));
        // productList.add(new BottleOfWater(200, "qwe", 150));
        // productList.add(new BottleOfWater(500, "zxcg", 1000));
        // productList.add(new BottleOfWater(123, "qaffwe", 10));

        productList.add(new HotDrink(250, "Coffee Espresso", 100, 95));
        productList.add(new HotDrink(200, "Irish Coffee", 200, 95));
        productList.add(new HotDrink(150, "Hot Chocolate", 150, 90));
        productList.add(new HotDrink(200, "Black Tea", 150, 85));
        productList.add(new HotDrink(150, "Green Tea", 150, 85));
        

        // BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);

        // System.out.println(vendingMachine.getProduct("qwe", 150)); 
        // System.out.println(vendingMachine.getProduct("qwe"));
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
// public class Program {
//     public static void main(String[] args) {
//         Product product1 = new Product();
//         product1.setName("Chocolate");
//         product1.setCost(500);

//         VendingMachine vendingMachine1 = new VendingMachine();
//         List<Product> productList = new ArrayList<>();
//         productList.add(product1);
//         vendingMachine1.initProduct(productList);
//         System.out.println(vendingMachine1.getProduct("Chocolate"));
//     }
// }