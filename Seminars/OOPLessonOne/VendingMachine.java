package Seminars.OOPLessonOne;

import java.util.List;

public class VendingMachine {
    
    private List<Product> productList;

    void initProduct(List<Product> a) {
        productList = a;
    }

    Product getProduct(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (name.equals(productList.get(i).getName())) {
                return productList.get(i);
            }
        }
        return null;
    }
}