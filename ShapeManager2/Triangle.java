// STUB CODE: Dave Ghidiu
package ShapeManager2;
public class Triangle implements Shape {
    
    private int size;
    
    public Triangle() {
        size = 0;
    }
    
    public Triangle(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public double getArea() {
        
        return (Math.sqrt(3)/4)*(size * size); // must change this method
      
    }
    
    public double getPerimeter() {
        
        return 3 * size; // must change this method
      
    }
    
    public String toString() {
        
        return "This TRIANGLE has a side of " + size + ", a perimeter of " + getPerimeter() + ", and an area of " + getArea();
        
        
    }
    
    public int compareTo(Shape s) {
        
        return 0; // must change this method

      
    }
    
}