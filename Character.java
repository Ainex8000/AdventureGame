// Create the parent class
// This is our Character class, it holds the bases for all characters in the game
// It comes with a constructor to create a character with a name and stats
class Character {
    String name;
    int health;
    int mana;
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

    // Constructor
    public Character(String name, int health, int mana, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    // Method to display character stats
    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Wisdom: " + wisdom);
        System.out.println("Charisma: " + charisma);
    }

    // Method to attack
    public void attack() {
        System.out.println(name + " attacks!");
    }

    // Method to defend
    public void defend() {
        System.out.println(name + " defends!");
    }
}