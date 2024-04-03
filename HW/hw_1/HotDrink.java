package HW.hw_1;

public class HotDrink extends BottleOfWater {
    private int temperature;

    /**
     * Перегруженный конструктор класса горячих напитков
     *
     * @param name        Наименование напитка
     * @param price       Цена напитка
     * @param volume      Объем напитка
     * @param temperature Температура напитка
     */

    public HotDrink(String name, int price, int volume, int temperature) {
        super(price, name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + super.getName() +
                ", price=" + super.getPrice() +
                ", volume=" + super.getVolume() +
                ", temperature=" + temperature +
                '\'' +
                "}";
    }
}