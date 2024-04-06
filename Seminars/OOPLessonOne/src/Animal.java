package Seminars.OOPLessonOne.src;

public abstract class Animal implements HuntingStyle {
    protected String color; // можем использовать в классах наследниках

    public abstract void voice();
}