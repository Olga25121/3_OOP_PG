package Seminars.OOPLesson_6.workshop;

public abstract class Shape {
    protected String name;
    
    public Shape(String name){
    this.name = name;
    }
    
    public abstract double calculateArea();
    
    
    }