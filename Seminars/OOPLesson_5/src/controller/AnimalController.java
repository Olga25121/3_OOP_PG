package Seminars.OOPLesson_5.src.controller;



import model.Animal;
import service.AnimalService;

import java.util.List;

public class AnimalController {
    private AnimalService animalService = new AnimalService();

    public void addAnimal(Animal animal) {
        animalService.addAnimal(animal);
    }
    public List<Animal> getAnimalByType(String type){
       return animalService.getAnimalByType(type);
    }

}