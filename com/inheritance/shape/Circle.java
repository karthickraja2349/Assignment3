package shape;
public class Circle extends Shape{
      private int radius;
      
      public Circle(){
      
      }
      
      public Circle(int radius){
            this.radius = radius;
      }
      
      public int getRadius(){
            return radius;
      }      
      
      public double getArea(){
             return 3.14*radius*radius;
      }
      
      public int getPerimeter(){
             return 2*(int)3.14*radius;
      }
      
      public String toString(){
            StringBuilder result = new StringBuilder();
            result.append("------------------------------------------\n");
            result.append(String.format("| %-30s : %-5s |\n", "Radius of the Circle is", getRadius()));
            result.append(String.format("| %-30s : %-5s |\n", "Area of the Circle is", getArea()));
            result.append(String.format("| %-30s : %-5s |\n", "Perimeter of the Circle is", getPerimeter()));
            result.append("------------------------------------------");
            return result.toString();            
     }       
}                    
            
      
            
