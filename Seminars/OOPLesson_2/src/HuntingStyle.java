package Seminars.OOPLesson_2.src;

public interface HuntingStyle {
    void hunt();
    default void hello(){
        System.out.println("поведение по умолчанию. Реализуй у себя в классе!!!");

    }

}