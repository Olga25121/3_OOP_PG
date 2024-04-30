package Seminars.OOPLesson_7.workshop.task_2;

public class Main {

    public static void main(String[] args) {
        Pizza newPizza = PizzaFactory.createPizza("MargheritaPizza");
        System.out.println();
        newPizza.CoocPizza();
        System.out.println();
        System.out.println(newPizza);
        
    }

}
