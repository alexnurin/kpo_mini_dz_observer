class Developer implements Observer {
    final private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void update(String game, String achievements, String shortInfo, String techData) {
        System.out.println("Senior " + name + " says: " + game + " is updated with technical data: " + techData);
    }
}