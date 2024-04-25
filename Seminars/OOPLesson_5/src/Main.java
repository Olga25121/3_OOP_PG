package Seminars.OOPLesson_5.src;

import Seminars.OOPLesson_5.src.model.Cat;
import Seminars.OOPLesson_5.src.model.Dog;
import Seminars.OOPLesson_5.src.view.AnimalView;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("barsik", "orange");
        Cat cat1 = new Cat("murzik", "black");
        Cat cat2 = new Cat("felix", "gray");
        Cat cat3 = new Cat("toast", "orange");
        Cat cat4 = new Cat("vanilla", "white");
        Cat cat5 = new Cat("cat", "cat color");
        Dog dog = new Dog("bobik","gray");
        Dog dog1 = new Dog("sharik","овчарка");
        Dog dog2 = new Dog("афовл","бульдог");
        Dog dog3 = new Dog("dogName","something");
        Dog dog4 = new Dog("lastDog","niceBreed");
        AnimalView animalView = new AnimalView();
        animalView.addAnimal(cat);
        animalView.addAnimal(cat1);
        animalView.addAnimal(cat2);
        animalView.addAnimal(cat3);
        animalView.addAnimal(cat4);
        animalView.addAnimal(cat5);
        animalView.addAnimal(dog);
        animalView.addAnimal(dog1);
        animalView.addAnimal(dog2);
        animalView.addAnimal(dog3);
        animalView.addAnimal(dog4);
        System.out.println(animalView.getAnimalByType("cat"));
        System.out.println(animalView.getAnimalByType("dog"));
    }
}