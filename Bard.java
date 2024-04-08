class Bard extends Character{
    // Constructor
    public Bard(String name, int health, int mana, int strength, int dexterity, 
    int constitution, int intelligence, int wisdom, int charisma) {
        super(name, health, mana, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    // Set the user's stats to the Bard's
    public void setStats() {
        health = 100;
        mana = 100;
        strength = 10;
        dexterity = 14;
        constitution = 12;
        intelligence = 13;
        wisdom = 8;
        charisma = 15;
    }

    // Method to display character stats
    public void displayStats() {
        super.displayStats();
    }

    // Explain the class to the user
    public void explainClass() {
        System.out.println("Bards are entertainers and have strong charisma!");
        System.out.println("They can charm their enemies and allies!");
        System.out.println("Bards are able to inspire their allies to fight harder!");
        System.out.println("You are a talented musician from the Bard's College!");
    }

    // Method to play a song
    public void playSong() {
        System.out.println("You play a song on your lute and inspire your allies!");
    }
}
