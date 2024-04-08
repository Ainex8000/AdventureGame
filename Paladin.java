class Paladin extends Character{
    // Constructor
    public Paladin(String name, int health, int mana, int strength, int dexterity, int constitution, int intelligence, int wisdom, int charisma) {
        super(name, health, mana, strength, dexterity, constitution, intelligence, wisdom, charisma);
    }

    // Set the user's stats for the Paladin
    public void setStats(){
        health = 100;
        mana = 50;
        strength = 15;
        dexterity = 8;
        constitution = 13;
        intelligence = 12;
        wisdom = 10;
        charisma = 14;
    }

    // Method to display character stats
    public void displayStats(){
        super.displayStats();
    }

        // Explain the class to the user
        public void explainClass() {
            System.out.println("Paladins are holy warriors and have strong faith!");
            System.out.println("They can fight and protect their allies!");
            System.out.println("They have a special ability called Divine Smite!");
            System.out.println("You are from the Order of the Silver Hand!");
        }
}
