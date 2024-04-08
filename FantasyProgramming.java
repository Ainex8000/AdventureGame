// This assignment was originally used to demonstrate inheritance in Java using OOP.
// This week I'll be repurposing this assignment for the Java Contest.
// I will be adding on to the program by adding more classes and adding subclasses as well. 

// Import the Scanner class
import java.util.Scanner;

// Main class
// This is our main class, the player will pick between a cleric or a rogue
// Depending on their choice, it will create a character of that class
// It will then display their stats and have them perform an action
public class FantasyProgramming {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Introduce the program to the user
        System.out.println("Welcome to the fantasy adventure game!");
        System.out.println("In this game, you will create a character and go on an adventure!");
        System.out.println("Let's begin!");
        System.out.println("--------------------------------------");

        // Ask the user to pick a class
        System.out.println("Before we begin, let's create a character!");
        System.out.println("Please pick a class: Barbarian, Bard, Cleric, Druid, Fighter, Monk, Paladin, Ranger, Rogue, Sorcerer, Warlock, or Wizard");
        System.out.println("--------------------------------------");
        String choice = scanner.nextLine();

        // Create a character of the chosen class
        // If the player chooses Cleric, it will create a Cleric character
        if (choice.equals("Cleric")) {
            Cleric cleric = new Cleric("Aspen Soulterra", 100, 100, 8, 12, 13, 10, 15, 14);
            cleric.explainClass();
            cleric.setStats();
            cleric.displayStats();
        } 
        // If the player chooses Rogue, it will create a Rogue character
        else if (choice.equals("Rogue")) {
            Rogue rogue = new Rogue("Naomi Shim", 100, 50, 8, 15, 12, 14, 10, 13);
            rogue.explainClass();
            rogue.setStats();
            rogue.displayStats();
        } 
        // If the player chooses Fighter, it will create a Fighter character
        else if (choice.equals("Fighter")) {
            Fighter fighter = new Fighter("Silent Robin", 100, 100, 15, 14, 13, 10, 8, 12);
            fighter.explainClass();
            fighter.setStats();
            fighter.displayStats();
        }
        // If the player chooses Ranger, it will create a Ranger character
        else if (choice.equals("Ranger")) {
            Ranger ranger = new Ranger("Lucien", 100, 50, 13, 15, 14, 10, 12, 8);
            ranger.explainClass();
            ranger.setStats();
            ranger.displayStats();
        }
        // If the player chooses Wizard, it will create a Wizard character
        else if (choice.equals("Wizard")) {
            Wizard wizard = new Wizard("Marian", 100, 100, 8, 12, 13, 15, 10, 14);
            wizard.explainClass();
            wizard.setStats();
            wizard.displayStats();
        }
        // If the player chooses Barbarian, it will create a Barbarian character
        else if (choice.equals("Barbarian")) {
            Barbarian barbarian = new Barbarian("Grimbo", 100, 50, 15, 12, 14, 8, 10, 13);
            barbarian.explainClass();
            barbarian.setStats();
            barbarian.displayStats();
        }
        // If the player chooses Monk, it will create a Monk character
        else if (choice.equals("Monk")) {
            Monk monk = new Monk("Fei", 100, 50, 10, 15, 12, 14, 13, 8);
            monk.explainClass();
            monk.setStats();
            monk.displayStats();
        }
        // If the player chooses Paladin, it will create a Paladin character
        else if (choice.equals("Paladin")) {
            Paladin paladin = new Paladin("Valas", 100, 100, 14, 12, 15, 10, 8, 13);
            paladin.explainClass();
            paladin.setStats();
            paladin.displayStats();
        }
        // If the player chooses Sorcerer, it will create a Sorcerer character
        else if (choice.equals("Sorcerer")) {
            Sorcerer sorcerer = new Sorcerer("Solas Filkins", 100, 100, 8, 12, 13, 15, 10, 14);
            sorcerer.explainClass();
            sorcerer.setStats();
            sorcerer.displayStats();
        }
        // If the player chooses Warlock, it will create a Warlock character
        else if (choice.equals("Warlock")) {
            Warlock warlock = new Warlock("Francis", 100, 100, 8, 12, 13, 15, 10, 14);
            warlock.explainClass();
            warlock.setStats();
            warlock.displayStats();
        }
        // If the player chooses Bard, it will create a Bard character
        else if (choice.equals("Bard")) {
            Bard bard = new Bard("Astelle Ponnorn", 100, 100, 8, 12, 13, 15, 10, 14);
            bard.explainClass();
            bard.setStats();
            bard.displayStats();
        }
        // If the player chooses Druid, it will create a Druid character
        else if (choice.equals("Druid")) {
            Druid druid = new Druid("Valki", 100, 100, 8, 12, 13, 15, 10, 14);
            druid.explainClass();
            druid.setStats();
            druid.displayStats();
        }
        // If the player chooses anything else, it will display an error message
        else {
            System.out.println("Invalid class");
        }

        // Begin the adventure
        System.out.println("--------------------------------------");
        System.out.println("You are now ready to begin your adventure!");
        System.out.println("Good luck!");

        // Here we'll run a small quest for the player
        // The player will have to choose between two options
        // Depending on their choice, they will either succeed or fail
        System.out.println("You are walking through the forest when you see a goblin in the distance!");
        System.out.println("The goblin is guarding a treasure chest!");
        System.out.println("What will you do?");
        System.out.println("1. Sneak past the goblin (Special abilities may help you succeed)");
        System.out.println("2. Fight the goblin");

        // Get the player's choice
        int playerChoice = scanner.nextInt();

        // If the player chooses to sneak
        if (playerChoice == 1) {
            // If the player is a rogue, they will succeed
            if (choice.equals("Rogue")) {
                Rogue rogue = new Rogue("Naomi Shim", 100, 50, 8, 15, 12, 14, 10, 13);
                rogue.sneak();
                System.out.println("As a talented rogue, you are able to sneak past the goblin without any worries.");
                System.out.println("You successfully sneak past the goblin and open the treasure chest!");
                System.out.println("You find a new dagger!");
            } 
            // If the player is a bard, they will succeed
            else if (choice.equals("Bard")) {
                Bard bard = new Bard("Astelle Ponnorn", 100, 100, 8, 12, 13, 15, 10, 14);
                bard.playSong();
                System.out.println("You play a song on your lute and charm the goblin, allowing you to quickly walk past and get to the chest!");
                System.out.println("You successfully avoided the goblin and open the treasure chest!");
                System.out.println("You find a brand new lute!");
            }
            // If the player is a ranger, they will succeed
            else if (choice.equals("Ranger")) {
                Ranger ranger = new Ranger("Lucien", 100, 50, 13, 15, 14, 10, 12, 8);
                ranger.beastSummon();
                System.out.println("You summon a beast companion to distract the goblin while you sneak past!");
                System.out.println("You find a new bow inside!");
            }
            // if the player is a Druid, they will succeed
            else if (choice.equals("Druid")) {
                Druid druid = new Druid("Valki", 100, 100, 8, 12, 13, 15, 10, 14);
                druid.wildShape();
                System.out.println("You wild shape into a squirrel and quickly run past the goblin!");
                System.out.println("You successfully avoid the goblin and open the treasure chest!");
                System.out.println("You find a new staff inside!");
            }
            // If the player is not a certain class, they will fail
            else {
                System.out.println("You attempt to sneak past the goblin, but you trip and fall!");
                System.out.println("The goblin sees you and attacks you while you're down!");
                System.out.println("You are brought to a swift end!");
                System.out.println("Game Over!");
            }
        }
        // If the player chooses to fight
        else if (playerChoice == 2) {
            // If the player is a fighter, they will succeed
            if (choice.equals("Fighter")) {
                Fighter fighter = new Fighter("Silent Robin", 100, 100, 15, 14, 13, 10, 8, 12);
                fighter.attack();
                System.out.println("You defeat the goblin and open the treasure chest!");
                System.out.println("You find a shiny sword inside!");
            } 
            // If the player is a paladin, they will succeed
            else if (choice.equals("Paladin")) {
                Paladin paladin = new Paladin("Valas", 100, 100, 14, 12, 15, 10, 8, 13);
                paladin.attack();
                System.out.println("You defeat the goblin and open the treasure chest!");
                System.out.println("You find a shiny sword inside!");
            }
            // If the player is a barbarian, they will succeed
            else if (choice.equals("Barbarian")) {
                Barbarian barbarian = new Barbarian("Grimbo", 100, 50, 15, 12, 14, 8, 10, 13);
                barbarian.attack();
                System.out.println("You defeat the goblin and open the treasure chest!");
                System.out.println("You find a shiny battleaxe inside!");
            }
            // If the player is a monk, they will succeed
            else if (choice.equals("Monk")) {
                Monk monk = new Monk("Fei", 100, 50, 10, 15, 12, 14, 13, 8);
                monk.attack();
                System.out.println("You defeat the goblin and open the treasure chest!");
                System.out.println("You find a new pole staff!");
            }
            // If the player is a sorcerer, they will succeed
            else if (choice.equals("Sorcerer")) {
                Sorcerer sorcerer = new Sorcerer("Solas Filkins", 100, 100, 8, 12, 13, 15, 10, 14);
                sorcerer.attack();
                System.out.println("You defeat the goblin and open the treasure chest!");
                System.out.println("You find a new staff!");
            }
            // If the player is a warlock, they will succeed
            else if (choice.equals("Warlock")) {
                Warlock warlock = new Warlock("Francis", 100, 100, 8, 12, 13, 15, 10, 14);
                warlock.attack();
                System.out.println("You defeat the goblin and open the treasure chest!");
                System.out.println("You find a new robe!");
            }
            // If the player is a wizard, they will succeed
            else if (choice.equals("Wizard")) {
                Wizard wizard = new Wizard("Marian", 100, 100, 8, 12, 13, 15, 10, 14);
                wizard.attack();
                System.out.println("You defeat the goblin and open the treasure chest!");
                System.out.println("You find a new staff!");
            }
            // If the player is a cleric, they will succeed
            else if (choice.equals("Cleric")) {
                Cleric cleric = new Cleric("Aspen Soulterra", 100, 100, 8, 12, 13, 10, 15, 14);
                cleric.attack();
                System.out.println("You defeat the goblin and open the treasure chest!");
                System.out.println("You find a new shield inside!");
            }
            // If the player is a ranger, they will succeed
            else if (choice.equals("Ranger")) {
                Ranger ranger = new Ranger("Lucien", 100, 50, 13, 15, 14, 10, 12, 8);
                ranger.attack();
                System.out.println("You defeat the goblin and open the treasure chest!");
                System.out.println("You find a new a bow!");
            }
            // If the player is not a fighter, they will fail
            else {
                System.out.println("You try to fight the goblin, but it is too strong!");
                System.out.println("The goblin defeats you!");
                System.out.println("Game Over!");
            }
        }

        // Close the scanner
        scanner.close();
    }
}