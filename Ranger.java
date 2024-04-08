class Ranger extends Character {
    // Constructor
    public Ranger(String name, int health, int mana, int strength, int dexterity, int constitution, int intelligence,
            int wisdom, int charisma) {
        super(name, health, mana, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    // Set the user's stats to the Ranger class
    public void setStats() {
        health = 100;
        mana = 50;
        strength = 13;
        dexterity = 15;
        constitution = 14;
        intelligence = 10;
        wisdom = 12;
        charisma = 8;
    }

    // Method to display character stats
    public void displayStats() {
        super.displayStats();
    }

    // Explain the class to the user
    public void explainClass() {
        System.out.println("Ranger are skilled hunters and trackers!");
        System.out.println("They are known for their agility and dexterity!");
        System.out.println("They are able to connect with nature and call upon beast companions!");
        System.out.println("You are a skilled archer from a hunting village in the forest!");
    }

    // Method to display the Ranger's special ability
    public void beastSummon() {
        System.out.println("You summon a beast companion!");
    }
}
