package model;

public class Teacher extends User{
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getsubject() {
        return subject;
    }

    public void setsubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return getsubject();
    }
}