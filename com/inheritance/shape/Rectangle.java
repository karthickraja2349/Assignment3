package shape;
public class Rectangle extends Shape {

    public Rectangle(int length, int breadth) {
        super(length, breadth); 
    }
    
    public double getArea() {
        return getLength() * getBreadth();  
    }
    
    public int getPerimeter() {
        return 2 * (getLength() + getBreadth());
    }
    
    
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("------------------------------------------\n");
        result.append(String.format("| %-30s : %-5s |\n", "Length of the Rectangle is", getLength()));
        result.append(String.format("| %-30s : %-5s |\n", "Breadth of the Rectangle is", getBreadth()));
        result.append(String.format("| %-30s : %-5s |\n", "Area of the Rectangle is", getArea()));
        result.append(String.format("| %-30s : %-5s |\n", "Perimeter of the Rectangle is", getPerimeter()));
        result.append("------------------------------------------");
        return result.toString();
    }
    

}

