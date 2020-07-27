// STUB CODE: Dave Ghidiu
package ShapeManager2;
public class Circle implements Shape {
    
    private int size;
    
    public Circle() {
        size = 0;
    }
    
    public Circle(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public double getArea() {
        
        return Math.PI * size * size;

    }
    
    public double getPerimeter() {
        
        return 2 * Math.PI * size;
        
    }
    
    public String toString() {
        
        return "This CIRCLE has a radius of " + size + ", a circumference of " + getPerimeter() + ", and an area of " + getArea();
        
    }
    
    public int compareTo(Shape s) {
        
        return 0; // must change this method
    }
    
}