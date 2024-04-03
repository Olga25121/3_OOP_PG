package Seminars.OOPLessonOne;

public class HotDrink extends BottleOfWater {
    private int temperature;
        /**
     * Перегруженный конструктор класса горячих напитков
     *
     * @param name   Наименование напитка
     * @param price  Цена напитка
     * @param volume Объем напитка
     * @param temperature Температура напитка
     */
    
    public HotDrink(int price, String name, int volume, int temperature) {
        super(price, name, volume);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
    @Override
    public String toString() {
        return "HotDrink{" +
        "temperature=" + temperature +
        ", volume=" + super.getVolume() + 
        ", price=" + super.getPrice() +
        ", name='" + super.getName() + '\'' +
        "}";
    }    
}