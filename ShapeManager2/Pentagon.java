// STUB CODE: Dave Ghidiu
package ShapeManager2;
public class Pentagon implements Shape {
    
    private int size;
    
    public Pentagon() {
        size = 0;
    }
    
    public Pentagon(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public double getArea() {
        
        return (Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * size * size) / 4; // must change this method
        
    }
    
    public double getPerimeter() {
        
         return 5 * size; // must change this method
      
    }
    
    public String toString() {
        
        return "This PENTAGON has a side of " + size + ", a perimeter of " + getPerimeter() + ", and an area of " + getArea();
        
    }
    
    public int compareTo(Shape s) {
        
        return 0; // must change this method
      
    }
    
}