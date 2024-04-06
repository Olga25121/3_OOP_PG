package Seminars.OOPLessonTwo.workshop;
import java.util.List;

public interface MarketBehaviour {
void acceptToMarket(Сustomer actor);
void releaseFromMarket(List<Сustomer> actors);
void update();
}