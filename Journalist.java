public class Journalist implements Observer {
    final private String name;

    public Journalist(String name) {
        this.name = name;
    }

    @Override
    public void update(String game, String achievements, String shortInfo, String techData) {
        System.out.println("Journalist " + name + ": I found new game — " + game);
        System.out.println("Short information that I have collected: " + shortInfo);
    }
}