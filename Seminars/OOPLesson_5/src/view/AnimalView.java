package Seminars.OOPLesson_5.src.view;



import java.util.List;

import Seminars.OOPLesson_5.src.controller.AnimalController;
import Seminars.OOPLesson_5.src.model.Animal;

public class AnimalView {
    private AnimalController animalController = new AnimalController();

    public void addAnimal(Animal animal) {
        animalController.addAnimal(animal);
        System.out.println("Пользователь " + animal + " сохранен");
    }
    public List<Animal> getAnimalByType(String type){
        System.out.println("Вывод животных по параметру " + type +":");
        return animalController.getAnimalByType(type);
    }

}
