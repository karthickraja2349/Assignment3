package shape;
public class Triangle extends Shape {
    private int sideA;
    private int sideB;
    private int sideC;
    
   
    public Triangle(int sideA, int sideB, int sideC) {
       
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getArea() {
        String triangleType = getTriangleType();
        if (triangleType.equals("Equilateral")) {
            return (Math.sqrt(3) / 4) * Math.pow(sideA, 2);
        }
        else if (triangleType.equals("Isosceles")) {
            double height = Math.sqrt(Math.pow(sideA, 2) - Math.pow(sideB / 2.0, 2));
            return 0.5 * sideB * height;
        }
        else {
            double semiPerimeter = (sideA + sideB + sideC) / 2.0;
            return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC)); // Heron's formula
        }
    }

    public int getPerimeter() {
        return sideA + sideB + sideC;
    }

    public String getTriangleType() {
        if (sideA == sideB && sideB == sideC)
            return "Equilateral";
        else if (sideA == sideB || sideB == sideC || sideA == sideC)
            return "Isosceles";
        else
            return "Scalene";
       
    }

   public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("             /\\              \n");
    result.append("            /  \\             \n");
    result.append(String.format("   Side A  /    \\ Side C    \n"));
    result.append("          /______\\           \n");
    result.append("           Side B            \n\n");

    // Add the triangle properties inside the triangle shape
    result.append("----------------------------------------------------\n");
    result.append(String.format("| %-25s : %-20s |\n", "Side A", sideA));
    result.append(String.format("| %-25s : %-20s |\n", "Side B", sideB));
    result.append(String.format("| %-25s : %-20s |\n", "Side C", sideC));
    result.append(String.format("| %-25s : %-20s |\n", "Area of Triangle", getArea()));
    result.append(String.format("| %-25s : %-20s |\n", "Perimeter of Triangle", getPerimeter()));
    result.append(String.format("| %-25s : %-20s |\n", "Triangle Type", getTriangleType()));
    result.append("----------------------------------------------------");

    return result.toString();
}

}

	

