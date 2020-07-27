package ShapeManager2;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeManager2 {
    
    public static void main (String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        int choice;
        
        while(true) {
        
            displayMenu();
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    addShape(scanner, shapes);
                    break;
                case 2:
                    removeShape(scanner, shapes);
                    break;
                case 3:
                    modifyShape(scanner, shapes);
                    break;
                case 4:
                    listShapes(shapes);
                    break;
                case 5:
                    System.out.println();
                    System.out.println("GAME OVER MAN!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.\n");
                    break;
            }

        }
        
    } 
    
    public static void displayMenu() {
        System.out.println("Please choose from the following:");
        System.out.println("\t1. Add a shape");
        System.out.println("\t2. Remove a shape");
        System.out.println("\t3. Modify a shape");
        System.out.println("\t4. List all shapes");
        System.out.println("\t5. Quit");
        System.out.println("Enter your choice:");
    }
    
    public static void addShape(Scanner scanner, ArrayList<Shape> shapes) {
        
        System.out.println();
        System.out.println("STUB CODE: addShape()");
        System.out.println("What type of shape would you like to add?");
        System.out.println("\t1. Circle");
        System.out.println("\t2. Triangle");
        System.out.println("\t3. Square");
        System.out.println("\t4. Pentagon");
        System.out.println("Enter your choice:");
        int shape = scanner.nextInt();

        System.out.println();
        System.out.println("How large would you like to make this shape?");
        int size = scanner.nextInt();

        System.out.println();

        if (shape == 1) {
            shapes.add(new Circle(size));
            System.out.println("A CIRCLE with a radius of " + size + "  has been created");
        } else if (shape == 2) {
            shapes.add(new Triangle(size));
            System.out.println("A TRIANGLE with a side of " + size + "  has been created");
        } else if (shape == 2) {
            shapes.add(new Square(size));
            System.out.println("A SQUARE with a side of " + size + "  has been created");
        } else if (shape == 4) {
            shapes.add(new Pentagon(size));
            System.out.println("A PENTAGON with a side of " + size + "  has been created");
        }

       
        System.out.println();
        
    }
    
    public static void removeShape(Scanner scanner, ArrayList<Shape> shapes) {
        
        System.out.println();
        System.out.println("STUB CODE: removeShape()");
        System.out.println("Please look at the following shapes:");
        System.out.println();
        int list = 1;
        System.out.println("======== SHAPES ========");
        for (int i = 0; i < shapes.size(); i++, list++) {
            System.out.println(list + ". " + shapes.get(i).getClass().getSimpleName() + ", size = " + shapes.get(i).getSize() + ", area = " + (Math.round((shapes.get(i).getArea() * 100)) / 100));
        }

        System.out.println();
        System.out.println("Which shape would you like to remove?");
        int select = scanner.nextInt();

        shapes.remove(select - 1);

        System.out.println();
        
    }    

    public static void modifyShape(Scanner scanner, ArrayList<Shape> shapes) {
        
        System.out.println();
        System.out.println("STUB CODE: modifyShape()");
        System.out.println();
        
    }   

    public static void listShapes(ArrayList<Shape> shapes) {

        System.out.println();
        int list = 1;
        System.out.println("======== SHAPES ========");
        for (int i = 0; i < shapes.size(); i++, list++) {
            System.out.println(list + ". " + shapes.get(i).getClass().getSimpleName() + ", size = " + shapes.get(i).getSize() + ", area = " + (Math.round((shapes.get(i).getArea() * 100) / 100)));
        }

        System.out.println();
    }
    
    public static void sortShapes(Scanner scanner, ArrayList<Shape> shapes) {
        
        System.out.println();
        System.out.println("STUB CODE: sortShapes()");
        System.out.println();
        
    }

}

