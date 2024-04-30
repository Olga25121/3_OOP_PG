package Seminars.OOPLesson_6.workshop;

class Rectangle extends Shape {

    public double width;
    public double height;
    
    public Rectangle(String name, double width, double height){
    super(name);
    this.width = width;
    this.height = height;
    }
    
    @Override
    public double calculateArea() {
    return width * height;
    }
    
    }
