package Seminars.OOPLessonOne.src;

public class Dog extends Animal implements AnimalBehaivour{
    @Override
    public void voice() {
        System.out.println("гав");
    }
    public void voice(String name){
        System.out.println("гав, меня зовут " + name);
    }


    public void test() {

    }

    @Override
    public void bheaivour() {
        System.out.println("Собака виляет хвостом");
    }
}