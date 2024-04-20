package Seminars.OOPLesson_2.src;

public abstract class Animal implements HuntingStyle {
    protected String color; // можем использовать в классах наследниках

    public abstract void voice();
}