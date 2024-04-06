package Seminars.OOPLessonTwo.workshop;

public abstract class Сustomer implements СustomerBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Сustomer(String name) {
        this.name = name;
        this.isMakeOrder = false;
        this.isTakeOrder = false;
    }

    abstract String getName();
}