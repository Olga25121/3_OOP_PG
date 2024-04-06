package Seminars.OOPLessonTwo.workshop;

public interface QueueBehaviour {
    void takeInQueue(Сustomer actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
