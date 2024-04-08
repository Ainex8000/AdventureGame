class Monk extends Character{
    // Constructor
    public Monk(String name, int health, int mana, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, health, mana, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }
    
    // Set the user's stats to the Monk's stats
    public void setStats() {
        health = 100;
        mana = 50;
        strength = 14;
        dexterity = 15;
        constitution = 13;
        intelligence = 8;
        wisdom = 12;
        charisma = 10;
    }
    
    // Method to display character stats
    public void displayStats() {
        super.displayStats();
    }
    
        // Explain the class to the user
        public void explainClass() {
            System.out.println("Monks are strong martial artists and have high dexterity!");
            System.out.println("They can fight hand-to-hand against their opponents!");
            System.out.println("They also have ki points to use special abilities!");
            System.out.println("You are a disciplined warrior from the Monastery!");
        }
}
