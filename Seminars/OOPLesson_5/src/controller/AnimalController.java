package Seminars.OOPLesson_5.src.controller;



import java.util.List;

import Seminars.OOPLesson_5.src.model.Animal;
import Seminars.OOPLesson_5.src.service.AnimalService;

public class AnimalController {
    private AnimalService animalService = new AnimalService();

    public void addAnimal(Animal animal) {
        animalService.addAnimal(animal);
    }
    public List<Animal> getAnimalByType(String type){
       return animalService.getAnimalByType(type);
    }

}