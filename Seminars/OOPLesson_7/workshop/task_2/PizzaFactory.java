package Seminars.OOPLesson_7.workshop.task_2;

public class PizzaFactory {
    public static Pizza createPizza(String type){
        if(type.equalsIgnoreCase("MargheritaPizza")){
            return new MargheritaPizza();            
        }else if (type.equalsIgnoreCase("PepperoniPizza")){
            return new PepperoniPizza();
        }else if (type.equalsIgnoreCase("VegetarianPizza")){
            return new VegetarianPizza();
        }
        return null;
    }
    
}