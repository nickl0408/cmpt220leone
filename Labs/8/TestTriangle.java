import java.util.Scanner;

public class TestTriangle {
       public static void main(String[] args) {
    	   Scanner input = new Scanner(System.in);
    	   
    	   System.out.print("Please enter 3 sides of a triangle ");
    	   
           double side1 = input.nextDouble();
           double side2 = input.nextDouble();
           double side3 = input.nextDouble();
           
           System.out.print("Please enter the color: ");
           String color = input.next();
           System.out.print("Is the triangle filled (true or false): ");
           boolean filled = input.nextBoolean();
           
           
           Triangle t = new Triangle(side1, side2, side3, color, filled);
           t.setColor(color);
           t.setFilled(filled);
           
           System.out.printf("Triangle perimeter: %.2f%n" +  "Triangle area: %.2f%n" + "Triangle color: %s%n" + "Triangle filled? %s%n",
                              t.getPerimeter(), 
                              t.getArea(),
                              t.getColor(),
                              t.isFilled());
           
           
       }
   }