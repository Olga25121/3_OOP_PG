package Seminars.OOPLesson_1.workshop;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

   
        productList.add(new BottleOfWater("Water", 50, 100));
        productList.add(new BottleOfWater("Cola", 300, 150));
        productList.add(new BottleOfWater("Orange", 500, 1000));
        productList.add(new BottleOfWater("Sprite", 200, 10));

           
        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine();
        vendingMachine.initProduct(productList);

     
        ;
        System.out.println();
        System.out.println(vendingMachine.getProduct("Water"));
        System.out.println(vendingMachine.getProduct("Cola"));
        System.out.println(vendingMachine.getProduct("Orange"));
        System.out.println(vendingMachine.getProduct("Sprite"));
        System.out.println();
    
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
}