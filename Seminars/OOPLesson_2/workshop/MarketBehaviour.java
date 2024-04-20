package Seminars.OOPLesson_2.workshop;
import java.util.List;

public interface MarketBehaviour {
void acceptToMarket(Actor actor);
void releaseFromMarket(List<Actor> actors);
// void update();
}