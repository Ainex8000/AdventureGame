class Druid extends Character {
    // Constructor
    public Druid(String name, int health, int mana, int strength, int dexterity, int constitution, int intelligence,
            int wisdom, int charisma) {
        super(name, health, mana, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    // Set the user's stats to the Druid's stats
    public void setStats() {
        health = 100;
        mana = 100;
        strength = 10;
        dexterity = 12;
        constitution = 14;
        intelligence = 13;
        wisdom = 15;
        charisma = 8;
    }

    // Method to display character stats
    public void displayStats() {
        super.displayStats();
    }

    // Explain the class to the user
    public void explainClass() {
        System.out.println("Druids are connected to nature and protect the environment!");
        System.out.println("They can heal themselves and their allies!");
        System.out.println("They are able to wild shape into animals!");
        System.out.println("You are from a forest tribe hidden away from the world.");
    }

    // Method to wild shape
    public void wildShape() {
        System.out.println("You wildshape into an animal!");
    }
}
