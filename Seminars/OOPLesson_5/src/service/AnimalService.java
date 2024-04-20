package Seminars.OOPLesson_5.src.service;



import model.Animal;
import model.Cat;
import model.Dog;

import java.util.ArrayList;
import java.util.List;

public class AnimalService {
    private List<Animal> animals;

    public AnimalService() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimalByType(String type) {
        List<Animal> catList = new ArrayList<>();
        List<Animal> dogList = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                catList.add(animal);

            } else if (animal instanceof Dog) {
                dogList.add(animal);


            }

        }
        if (type.equals("dog")) {
            return dogList;

        } else if (type.equals("cat")) {
            return catList;

        } else {
            return null;
        }


    }
}
