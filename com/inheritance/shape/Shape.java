package shape;
public abstract class Shape {
    private int length;
    private int breadth;
    
    public Shape(){
        
    }

    public Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }
    
    abstract double getArea();
    abstract int getPerimeter();
}
