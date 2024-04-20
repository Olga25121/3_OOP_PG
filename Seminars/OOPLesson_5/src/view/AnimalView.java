package Seminars.OOPLesson_5.src.view;



import controller.AnimalController;
import model.Animal;

import java.util.List;

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
