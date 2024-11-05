package shape;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Geometry {

    private static Geometry geometry;
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;

  
    private Geometry() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        printWriter = new PrintWriter(System.out, true);
    }

    
    public static Geometry getGeometryInstance() {
        if (geometry == null) 
            geometry = new Geometry();
        return geometry;
    }

    
    public void letsGo() {
        printWriter.println("Welcome to the World of Geometry!");
        printWriter.println("Select the Shape as Per Your Wish (Press the Number): ");
        displayMenu();
        handleUserInput();
    }

    
    private void displayMenu() {
        printWriter.println("-------------------------------------");
        printWriter.println("| Option    |   Shape Menu          |");
        printWriter.println("|-----------+-----------------------|");
        printWriter.println("|   1       |   Rectangle           |");
        printWriter.println("|   2       |   Triangle            |");
        printWriter.println("|   3       |   Circle                |");
        printWriter.println("-------------------------------------");
    }

   
    private void handleUserInput() {
        try {
            String input = bufferedReader.readLine();
            switch (input) {
                case "1":
                    handleRectangle();
                    break;
                case "2":
                    handleTriangle();
                    break;
                case "3":
                    handleCircle();
                    break;
                default:
                    printWriter.println("Invalid choice, please select again.");
                    displayMenu();
                    handleUserInput();  
                    break;
            }
        } 
        catch (IOException e) {
            printWriter.println("An error occurred while reading input.");
        }
    }

    
   private void handleRectangle() {
       int length = getValidInput("Enter the length of the rectangle: ");
       int breadth = getValidInput("Enter the breadth of the rectangle: ");
       Shape rectangle = new Rectangle(length, breadth);
       printWriter.println(rectangle.toString());
   }


    
   private void handleTriangle() {
      int sideA = getValidInput("Enter the first side of the triangle: ");
      int sideB = getValidInput("Enter the second side of the triangle: ");
      int sideC = getValidInput("Enter the third side of the triangle: ");
      Shape triangle = new Triangle(sideA, sideB, sideC);
      printWriter.println(triangle.toString());
  }
  
   private void handleCircle(){
       int radius = getValidInput("Enter the radius of the Circle:");
       Shape circle = new Circle(radius);
       printWriter.println(circle.toString()); 
   }    
  
  private int getValidInput(String message) {
      while (true) {
         try {
             printWriter.println(message);
             return Integer.parseInt(bufferedReader.readLine());
        } 
        catch (IOException | NumberFormatException e) {
            printWriter.println("Invalid input. Please enter a numeric value.");
        }
    }
}


    
   
}
