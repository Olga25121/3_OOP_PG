package HW.hw_1;

public class BottleOfWater extends Product {
    private int volume;

    public BottleOfWater(int price, String name, int volume) {
        super(price, name);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "BottleOfVatter{" +
                "volume=" + volume +
                ", price=" + super.getPrice() +
                ", name='" + super.getName() + '\'' +
                "}";
    }

}
