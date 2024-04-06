package Seminars.OOPLessonOne.workshop;

public class BottleOfWater extends Product {
    private int volume;

    public BottleOfWater(String name, int price, int volume) {
        super(price, name);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "BottleOfVatter {" +
                "name:"+"\t" + super.getName() + "\t" +
                "volume = " + volume + 
                ", price = " + super.getPrice() +
                "}";
    }

}
