package Seminars.OOPLessonTwo.workshop;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
