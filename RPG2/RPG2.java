// VERSION 2.0.6

// NAME: Brian Coe
// DATE:
// DESC:
package RPG2;
import java.util.Scanner;
import java.util.ArrayList;

public class RPG2 {

  public final static boolean DEBUG = false;
    public static void main (String[] args) {

        Character.setDebug(DEBUG);
        Battle.setDebug(DEBUG);

        Scanner scanner = new Scanner(System.in);
        int choice;

        ArrayList<Character> character = new ArrayList<Character>();
        
        while (true) {
            
            displayMenu();
            
            System.out.println("Select from the following options:");
            choice = scanner.nextInt();
            
            switch (choice) {
                
                case 1: createChar(character, scanner);
                        break;
                case 2: displayStats(character, scanner);
                        break;                        
                case 3: displayAllStats(character);
                        break;  
                case 4: duel(character, scanner);
                        break;
                case 5: System.out.println("\nGAME OVER MAN!.");
                        return;
                default: System.out.println("Not a valid choice.");
                        break;                
                         
            }
            
        }

       
       
    }

    public static void createChar(ArrayList<Character> character, Scanner scanner) {

        int startingStatPoints = 20;
        int currentStatPoints = startingStatPoints;

        System.out.print("Enter a name for you Character: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println();

        System.out.println("Choose from the following classes.");
        System.out.println("1: " + Warlock.getClassDescription());
        System.out.println("2: " + Druid.getClassDescription());
        System.out.println("3: " + Paladin.getClassDescription());
        System.out.println();
        System.out.print("Enter a number from the list above to select a Class for your Character: ");
        int classSelect = scanner.nextInt();
        System.out.println();

        System.out.println("You have a total of " + currentStatPoints + " points remaining to spend on your character.");
        System.out.print("Enter the Strength of your character. Select a number between 1 and " + currentStatPoints + ": ");
        int strength = scanner.nextInt();
        currentStatPoints = currentStatPoints - strength;
        System.out.println();

        System.out.println("You have a total of " + currentStatPoints + " points remaining to spend on your character.");
        System.out.print("Enter the Defense for your character. Select a number between 1 and " + currentStatPoints + ": ");
        int defense = scanner.nextInt();
        currentStatPoints = currentStatPoints - defense;
        System.out.println();

        System.out.println("You have a total of " + currentStatPoints + " points remaining to spend on your character.");
        System.out.print("Enter the character's Special Ability Rating. Select a number between 1 and " + currentStatPoints + ": ");
        int special = scanner.nextInt();
        currentStatPoints = currentStatPoints - special;
        System.out.println();

        if (currentStatPoints != 0) {
            System.out.println("You have " + currentStatPoints + " remaining.");
            System.out.println();
  
            System.out.println("You have a total of " + currentStatPoints + " points remaining to spend on your character.");
            System.out.print("Add more Defense to your character. Add up to " + currentStatPoints + " to your Defense  or enter 0 to skip: ");
            defense = defense + scanner.nextInt();
            currentStatPoints = (currentStatPoints - defense);
            System.out.println();
    
            System.out.println("You have a total of " + currentStatPoints + " points remaining to spend on your character.");
            System.out.print("Add more Strength to your character. Add up to " + currentStatPoints + " to your Strength  or enter 0 to skip: ");
            strength = strength + scanner.nextInt();
            currentStatPoints = (currentStatPoints - strength);
            System.out.println();

            System.out.println("You have a total of " + currentStatPoints + " points remaining to spend on your character.");
            System.out.print("Add more Special Ability Points to your character. Add up to " + currentStatPoints + " to your Special Ability or enter 0 to skip: ");
            special = special + scanner.nextInt();
            currentStatPoints = (currentStatPoints - strength);
            System.out.println();

        }

        if (classSelect == 1) {
          String className = "Warlock";
          character.add(new Warlock(name, defense, strength, special, currentStatPoints));
          character.get(character.size()-1).setClassName(className);
        } else if (classSelect == 2) {
          String className = "Druid";
          character.add(new Warlock(name, defense, strength, special, currentStatPoints));
          character.get(character.size()-1).setClassName(className);
        } else if (classSelect == 3) {
          String className = "Paladin";
          character.add(new Warlock(name, defense, strength, special, currentStatPoints));
          character.get(character.size()-1).setClassName(className);
        }

        System.out.println("You have created " + name + ".");
        System.out.println(name + "'s current character sheet is shown below");
        System.out.println("--------------------------------");
        System.out.println(character.get(character.size()-1));
        System.out.println();


    }

    public static void displayStats(ArrayList<Character> character, Scanner scanner) {
        System.out.println("Below is a listing of all available characters.");
        for (int i = 0; i < character.size(); i++) {
            System.out.println("\t" + (i) + ": " + character.get(i).getName());
        }
        System.out.print("Enter the number of a character to view their stats: ");
        int selection = scanner.nextInt();
        System.out.println();

        //int index = character.indexOf(selection);
        System.out.println(character.get(selection).toString());
        System.out.println();
    }

    public static void displayAllStats(ArrayList<Character> character) {
        for (int i = 0; i < character.size(); i++) {
            System.out.println("\t" + character.get(i).toString());
            System.out.println();
        }

    }

    public static void duel(ArrayList<Character> character, Scanner scanner) {
        System.out.println("Select a character from the list below to start a duel.");
        for (int i = 0; i < character.size(); i++) {
            System.out.println("\t" + (i) + ": " + character.get(i).getName());
        }

        System.out.print("Select your first character: ");
        int char1 = scanner.nextInt();
        System.out.println();

        System.out.print("Select your second character: ");
        int char2 = scanner.nextInt();
        System.out.println();

        Battle battle = new Battle(character.get(char1), character.get(char2));
        battle.superSmash();

    }

    public static void displayMenu() {

        System.out.println("\t1. Create a character");
        System.out.println("\t2. See the stats of a Character");
        System.out.println("\t3. See the stats of all the Characters");
        System.out.println("\t4. Select characters for a duel");
        System.out.println("\t5. Quit");
              
    }

}