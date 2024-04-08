class Barbarian extends Character {
    // Constructor
    public Barbarian(String name, int health, int mana, int strength, int dexterity,
            int constitution, int intelligence, int wisdom, int charisma) {
        super(name, health, mana, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    // Set the user's stats to the Barbarian's stats
    public void setStats() {
        health = 100;
        mana = 50;
        strength = 15;
        dexterity = 13;
        constitution = 14;
        intelligence = 8;
        wisdom = 10;
        charisma = 12;
    }

    // Method to display character stats
    public void displayStats() {
        super.displayStats();
    }

    // Explain the class to the user
    public void explainClass() {
        System.out.println("Barbarians are strong and fierce warriors!");
        System.out.println("They are known for their brute strength and high health!");
        System.out.println("They are able to rage in combat, increasing their strength and constitution!");
        System.out.println("You are from the northern tribes of the realm, and you worship the god of war, Kord.");
    }
}
