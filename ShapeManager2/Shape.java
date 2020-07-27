package ShapeManager2;
public interface Shape extends Comparable<Shape> {
    
    public int getSize();
    public void setSize(int size);
    
    public double getPerimeter();
    public double getArea();

}