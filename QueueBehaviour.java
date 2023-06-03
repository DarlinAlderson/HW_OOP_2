package HomeWork_8;

public interface QueueBehaviour {
    void takeInQueue(Client actor);
    void giveOrder();
    void takeOrder();
    void releaseFromQueue();
    void printQueue();

}
