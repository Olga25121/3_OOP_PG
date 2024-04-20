package Seminars.OOPLesson_5.src.model;



public class Cat extends Animal{
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public Cat(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}