class Wizard extends Character{

    // Constructor
    public Wizard(String name, int health, int mana, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, health, mana, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    // Set the user's stats to the Wizard's stats
    public void setStats() {
        health = 100;
        mana = 100;
        strength = 8;
        dexterity = 10;
        constitution = 13;
        intelligence = 15;
        wisdom = 14;
        charisma = 12;
    }

    // Method to display character stats
    public void displayStats() {
        super.displayStats();
    }

        // Explain the class to the user
        public void explainClass() {
            System.out.println("Wizards are intelligent spellcasters and scholars!");
            System.out.println("They can cast powerful spells and wield magical items!");
            System.out.println("They have a special ability to regain mana points!");
            System.out.println("You are a talented wizard from the Wizard's Tower!");
        }
}
