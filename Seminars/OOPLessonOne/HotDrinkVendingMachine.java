package Seminars.OOPLessonOne;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
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
    /**
     * 
     * @param name
     * @param volume
     * @param temperature
     * @return
     */
    public Product getProduct(String name, int volume, int temperature){
        for (Product product : productList) {
            if (product.getName().equals(name) &&
                    ((HotDrink)product).getVolume() == volume &&
                    ((HotDrink)product).getTemperature() == temperature) {
                return product;
            }
        }
        return null;
    }
}