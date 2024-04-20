package Seminars.OOPLesson_2.src;

// import java.io.Serializable;
// import java.util.Iterator;

public class Cat extends Animal  {
    public Cat(String color){
        this.color = color;
    }

    public Cat() {
    }

    @Override
    public void voice() {
        System.out.println("мяу");
    }

    @Override
    public void hunt() {
        System.out.println("кошка охотится на корм");
    }



    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                '}';
    }
}