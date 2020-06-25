// NAME: Brian Coe
// DATE: 06/24/2020
// DESC: 
package RPG;
import java.util.Scanner;
import java.util.ArrayList;

public class RPG {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        ArrayList<Character> character = new ArrayList<Character>();
        
        //final static String VERSION = "2020-SU-V0.9";
        //final static boolean DEBUG = true;

        character.add(new Character("Stanwyck", 5, 5, 10, 0));
        character.add(new Character("Mindy", 10, 5, 5, 0));


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

        System.out.println("You have a total of " + currentStatPoints + " points available to spend on your character.");
        System.out.println();
        System.out.print("Enter the starting hit points for your character. Select a number between 1 and " + currentStatPoints + ": ");
        int hp = scanner.nextInt();
        currentStatPoints = currentStatPoints - hp;
        System.out.println();

        System.out.println("You have a total of " + currentStatPoints + " points remaining to spend on your character.");
        System.out.print("Enter the starting armor for your character. Select a number between 1 and " + currentStatPoints + ": ");
        int armor = scanner.nextInt();
        currentStatPoints = currentStatPoints - armor;
        System.out.println();

        System.out.println("You have a total of " + currentStatPoints + " points remaining to spend on your character.");
        System.out.print("Enter the starting strength for your character. Select a number between 1 and " + currentStatPoints + ": ");
        int strength = scanner.nextInt();
        currentStatPoints = currentStatPoints - strength;
        System.out.println();

        if (currentStatPoints != 0) {
            System.out.println("You have " + currentStatPoints + " remaining.");
            System.out.println();

            System.out.println("You have a total of " + currentStatPoints + " points remaining to spend on your character.");
            System.out.print("Add more hit points to your character. Add up to " + currentStatPoints + " to your hit points or enter 0 to skip: ");
            hp = hp + scanner.nextInt();
            currentStatPoints = (currentStatPoints - hp);
            System.out.println();
    
            System.out.println("You have a total of " + currentStatPoints + " points remaining to spend on your character.");
            System.out.print("Add more armor to your character. Add up to " + currentStatPoints + " to your armor  or enter 0 to skip: ");
            armor = armor + scanner.nextInt();
            currentStatPoints = (currentStatPoints - armor);
            System.out.println();
    
            System.out.println("You have a total of " + currentStatPoints + " points remaining to spend on your character.");
            System.out.print("Add more strength to your character. Add up to " + currentStatPoints + " to your strength  or enter 0 to skip: ");
            strength = strength + scanner.nextInt();
            currentStatPoints = (currentStatPoints - strength);
            System.out.println();

        }

        character.add(new Character(name, hp, armor, strength, currentStatPoints));
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

        character.get(char1).attack(character.get(char2));

    }

    public static void displayMenu() {

        System.out.println("\t1. Create a character");
        System.out.println("\t2. See the stats of a Character");
        System.out.println("\t3. See the stats of all the Characters");
        System.out.println("\t4. Select characters for a duel");
        System.out.println("\t5. Quit");
              
    }

}