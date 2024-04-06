package Seminars.OOPLessonOne.src;

public class Capybara extends Animal {
    @Override
    public void voice() {
        System.out.println("звуки капибары");
    }
    @Override
    public void hunt() {
        System.out.println("капибара охотится на траву");
    }




    @Override
    public String toString() {
        return "Capybara{" +
                "color='" + color + '\'' +
                '}';
    }
}