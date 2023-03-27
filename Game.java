import java.util.ArrayList;
import java.util.List;

public class Game {
    public void newGame(String game, String achievements, String shortInfo, String techData) {
        this.gameName = game;
        this.achievements = achievements;
        this.shortInfo = shortInfo;
        this.techData = techData;
        notifyObservers();
    }
    final private List<Observer> observers = new ArrayList<>();
    private String gameName;
    private String achievements;
    private String shortInfo;
    private String techData;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(gameName, achievements, shortInfo, techData);
        }
    }


}