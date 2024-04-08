class Sorcerer extends Character{
    //constructor
    public Sorcerer(String name, int health, int mana, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, health, mana, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    // Set the user's stats to the Sorcerer class
    public void setStats() {
        health = 8;
        mana = 12;
        strength = 8;
        dexterity = 10;
        constitution = 14;
        intelligence = 12;
        wisdom = 13;
        charisma = 15;
    }

    // Method to display character stats
    public void displayStats() {
        super.displayStats();
    }

        // Explain the class to the user
        public void explainClass() {
            System.out.println("Sorcerers are magically gifted and have strong mana!");
            System.out.println("They can cast powerful spells and manipulate the elements!");
            System.out.println("They are well versed in charisma and constitution!");
            System.out.println("You are a talented sorcerer from the Arcane Academy!");
        }
}
