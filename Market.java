package HomeWork_8;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour {
    List <Client> ClientList = new LinkedList<>( );
    Queue <Client> actorQueue = new ArrayDeque<>();

    @Override
    public void acceptToMarket(Client actor) {
        System.out.println(actor.getName() + " зашел(а) в магазин.");
        ClientList.add(actor);
    }

    @Override
    public void releaseFromMarket(Client actor) {
        System.out.println(actor.getName() + " покинул(а) магазин.");
        ClientList.remove(actor);
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Client actor) {
        System.out.println(actor.getName() + " встал(а) в очередь.");
        actorQueue.add(actor);
    }

    @Override
    public void takeOrder() {
        System.out.println(actorQueue.peek().getName() + " забрал(а) заказ.");
        actorQueue.peek().isTakeOrder();
    }

    @Override
    public void giveOrder() {
        System.out.println(actorQueue.peek().getName() + " сделал(а) заказ.");
        actorQueue.peek().isMakeOrder();
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorQueue.peek().getName() + " покинул(а) очередь.");
        actorQueue.poll();
    }

    @Override
    public void printQueue() {
        System.out.println(actorQueue);
    }
}