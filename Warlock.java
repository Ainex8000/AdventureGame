class Warlock extends Character{
    // constructor
    public Warlock(String name, int health, int mana, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, health, mana, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    // Sets the user's stats to the warlock class
    public void setStats() {
        health = 100;
        mana = 100;
        strength = 10;
        dexterity = 13;
        constitution = 14;
        intelligence = 8;
        wisdom = 12;
        charisma = 15;
    }

    // Method to display character stats
    public void displayStats() {
        super.displayStats();
    }

        // Explain the class to the user
        public void explainClass() {
            System.out.println("Warlocks are spellcasters who make pacts with powerful beings!");
            System.out.println("They can cast powerful spells and hex their enemies!");
            System.out.println("Warlocks are well known for their Eldritch Blasts and invocations!");
            System.out.println("You are a warlock who made a pact with a powerful Archfey!");
        }
}
