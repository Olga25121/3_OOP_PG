package Seminars.OOPLessonOne.task_1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Chocolate");
        product1.setCost(500);

        VendingMachine vendingMachine1 = new VendingMachine();
        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        vendingMachine1.initProduct(productList);
        System.out.println(vendingMachine1.getProduct("Chocolate"));
    }
}