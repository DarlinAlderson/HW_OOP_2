package HomeWork_8;

public interface MarketBehaviour {
    void acceptToMarket(Client actor);
    void releaseFromMarket(Client actor);

    void update();
}