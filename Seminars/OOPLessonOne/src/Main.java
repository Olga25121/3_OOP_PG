package Seminars.OOPLessonOne.src;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.setName("barsik");
//        animal.setName("murzik");
//        System.out.println(animal.getName() + " "+ animal.getAge());
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.setName("murzik");
        cat.voice();
        dog.voice();
        cat.bheaivour();
        dog.bheaivour();

    }
}