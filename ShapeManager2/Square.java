// STUB CODE: Dave Ghidiu
package ShapeManager2;
public class Square implements Shape {
    
    private int size;
    
    public Square() {
        size = 0;
    }
    
    public Square(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public double getArea() {
   
        return size * size; // must change this method

    }
    
    public double getPerimeter() {

        return size * 4; // must change this method
      
    }
    
    public String toString() {
        
        return "This SQUARE has a sie of " + size + ", a perimeter of " + getPerimeter() + ", and an area of " + getArea();
        
        
    }
    
    public int compareTo(Shape s) {
    
        return 0; // must change this method
      
    }
    
}