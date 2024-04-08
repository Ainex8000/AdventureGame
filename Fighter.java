class Fighter extends Character{
    // Constructor
    public Fighter(String name, int health, int mana, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, health, mana, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }
    
    // Set the user's stats to the Fighter's stats
    public void setStats() {
        health = 100;
        mana = 100;
        strength = 15;
        dexterity = 14;
        constitution = 13;
        intelligence = 10;
        wisdom = 8;
        charisma = 12;
    }
    
    // Method to display character stats
    public void displayStats() {
        super.displayStats();
    }
    
        // Explain the class to the user
    public void explainClass() {
        System.out.println("Fighters are strong soldiers and have high strength!");
        System.out.println("They can wield heavy weapons and armor!");
        System.out.println("They have a special ability to action surge!");
        System.out.println("You are a skilled warrior from the Fighter's Guild!");
    }
}
