// Child class
// This is our Rogue class, it inherits from the Character class
// It comes with a constructor to create a Rogue with a name and stats
class Rogue extends Character {

    // Constructor
    public Rogue(String name, int health, int mana, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, health, mana, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    // Set the user's stats to the Rogue's stats
    public void setStats() {
        health = 100;
        mana = 50;
        strength = 8;
        dexterity = 15;
        constitution = 12;
        intelligence = 14;
        wisdom = 10;
        charisma = 13;
    }

    // Method to display character stats
    // Rogues are sneaky, so they will gain a stealth stat
    public void displayStats() {
        super.displayStats();
    }

    // Explain the class to the user
    public void explainClass() {
        System.out.println("Rogues are sneaky and have strong stealth!");
        System.out.println("They can sneak past enemies and pick locks!");
        System.out.println("They are also strong in dexterity and intelligence!");
        System.out.println("You have ties to the thieves guild in the realm, The Black Hand.");
    }

    // Method to sneak
    public void sneak() {
        System.out.println(name + " sneaks!");
    }
}
