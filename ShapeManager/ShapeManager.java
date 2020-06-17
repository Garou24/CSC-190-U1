// NAME: Brian Coe
// DATE: 06/11/2020
// PROGRAM DESCRIPTION: Java program to return details of a circle or Rectangle based on the user input.

// Skeleton code provided by Dave Ghidiu - FLCC

package ShapeManager;
import java.util.Scanner;
import java.util.ArrayList;

public class ShapeManager {
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the shape party!");
        
        // Create an ArrayList that can hold objects of type "Circle"  
        ArrayList<Circle> circles = new ArrayList<Circle>();
      
        // Create an ArrayList that can hold objects of type "Rectangle"  
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        
        int choice = 0;
        
        while (choice != 4) {
            
            displayMenu();
            
            System.out.println("Your choice?");
            choice = scanner.nextInt();
            
            switch (choice) {
                
                case 1:  addCircle(scanner, circles);
                         break;
                case 2:  addRectangle(scanner, rectangles);
                         break;                        
                case 3:  listShapes(circles, rectangles);
                         break;                
                case 4:  break;
                default: System.out.println("Not a valid choice.");
                         break;                
                         
            }
            
        }
        
        System.out.println("GAME OVER MAN!");
        
    }
    
    public static void addCircle(Scanner scanner, ArrayList<Circle> circles) {
        
        System.out.println("Enter a radius:");
        int radius = scanner.nextInt();

        circles.add(new Circle(radius,"CIRCLE"));

        System.out.println("You created a circle with radius of " + circles.get(circles.size()-1).getRadius());
        System.out.println();
 
    }
    
    public static void addRectangle(Scanner scanner, ArrayList<Rectangle> rectangles) {
        
        System.out.println("Enter a length:");
        int length = scanner.nextInt();

        System.out.println("Enter a width:");
        int width = scanner.nextInt();        

        rectangles.add(new Rectangle(length, width,"RECTANGLE"));

        System.out.println();

    }    
    
    public static void listShapes(ArrayList<Circle> circles, ArrayList<Rectangle> rectangles) {
           
        System.out.println("The circles are:");
        
        // This line of code is so you do not have to count the dashes :)
        System.out.println("-------------------------------");
        for (int i = 0; i < circles.size(); i++) {
            System.out.println(circles.get(i).getName() + " " + circles.get(i).getNumber());
            System.out.println("\tThe diameter is: " + (circles.get(i).diameter()));
            System.out.println("\tThe area is: " + (circles.get(i).area()));
            System.out.println("\tThe circumference is: " + (circles.get(i).circumference()));
            System.out.println();
        }

        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println();

        System.out.println("The rectangles are:");
        System.out.println("-------------------------------");
        for (int i = 0; i < rectangles.size(); i++) {
            System.out.println(rectangles.get(i).getName() + " " + rectangles.get(i).getNumber());
            System.out.println("\tThe area is: " + (rectangles.get(i).area()));
            System.out.println("\tThe perimeter is: " + (rectangles.get(i).perimeter()));
            System.out.println();
            }
        
        System.out.println("-------------------------------");
        System.out.println();
        
    }
    
    public static void displayMenu() {

        System.out.println("Please select from the following options:");
        System.out.println("\t1. Create a circle");
        System.out.println("\t2. Create a rectangle");
        System.out.println("\t3. List all shapes and their properties");
        System.out.println("\t4. Quit");
              
    }

}