package Seminars.OOPLessonTwo.src;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        LinkedList<Animal> animals = new LinkedList<>();
        cat.color = "gray";
        cat.voice();
        cat.hunt();

        animals.add(cat);

        Capybara capybara = new Capybara();
        capybara.color = "orange";
        capybara.voice();
        Owl owl = new Owl();
        owl.voice();
      cat.voice();
      animals.add(capybara);
        capybara.hunt();
        owl.hunt();
        System.out.println(cat);
        System.out.println(capybara);
        cat.hello();

    }
}