package Seminars.OOPLessonOne;


import java.util.List;

public class BottleOfWaterVM implements VendingMachine {
    private List<Product> productList;
    @Override
    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }
    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
    public Product getProduct(String name, int volume){
        for (Product product : productList) {
            if (product.getName().equals(name) &&
                    ((BottleOfWater)product).getVolume() == volume) {
                return product;
            }
        }
        return null;
    }
}