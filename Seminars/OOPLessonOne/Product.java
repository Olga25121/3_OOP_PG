package Seminars.OOPLessonOne;

public abstract class Product {
    private String name;
    private int cost;

    public Product(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" + "name='" + name + '\'' + ", cost=" + cost + '}';
    }
}
