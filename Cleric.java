// Child class
// This is our Cleric class, it inherits from the Character class
// It comes with a constructor to create a Cleric with a name and stats
class Cleric extends Character {
    // Constructor
    public Cleric(String name, int health, int mana, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, health, mana, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    // Set the user's stats to the Cleric's stats
    public void setStats() {
        health = 100;
        mana = 100;
        strength = 8;
        dexterity = 12;
        constitution = 13;
        intelligence = 10;
        wisdom = 15;
        charisma = 14;
    }

    // Method to display character stats
    // Clerics have faith, so they will gain a faith stat
    public void displayStats() {
        super.displayStats();
    }

    // Explain the class to the user
    public void explainClass() {
        System.out.println("Clerics are healers and have strong faith!");
        System.out.println("They can heal themselves and their allies!");
        System.out.println("They are also strong in wisdom and charisma!");
        System.out.println("You are a cleric of Helm, devoted to protecting the innocent.");
    }

    // Method to heal
    public void heal() {
        System.out.println(name + " heals!");
    }
}