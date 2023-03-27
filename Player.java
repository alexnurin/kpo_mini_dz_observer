class Player implements Observer {
    final private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void update(String game, String achievements, String shortInfo, String techData) {
        System.out.println("Player " + name + ": Guys, new achivs in " + game);
        System.out.println("Look! " + achievements);
    }
}