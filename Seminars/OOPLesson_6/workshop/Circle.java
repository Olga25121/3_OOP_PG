package Seminars.OOPLesson_6.workshop;

public class Circle extends Shape{

    private double radius;
    private double PI = Math.PI;
    
    public Circle(String name, double radius){
    super(name);
    this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
    return PI * Math.sqrt(radius);
    }
    }
