package Seminars.OOPLesson_2.workshop;

public abstract class Actor implements ActorBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public abstract String getName();
}