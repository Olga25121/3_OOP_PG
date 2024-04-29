package model;

public class Student extends User{
    private int studentId;

    public Student(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
      
        return "Студент {" + "ID =" + getStudentId() + "  Имя: " + super.getName()  + "}";
    }
}