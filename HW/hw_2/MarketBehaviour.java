package HW.hw_2;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(Actor actor);
    void update();
}