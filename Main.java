package HomeWork_8;

public class Main {
    public static void main(String[] args) {

        Customer hm = new Customer();
        hm.setName("Дарья");

        Market market = new Market();
        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.update();

    }
}
