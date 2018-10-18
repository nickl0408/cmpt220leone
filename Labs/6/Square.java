public class Square {
 
    private double width = 1;
 
    public Square() {
        
    }
    
    public Square(double newWidth) {
        width = newWidth;
    }
    
    public double getArea() {
        return width * width;
    }
    
    public double getPerimeter() {
        return 2 * (width + width);
    }
    
    public static void main(String[] args) {
        Square sq1 = new Square(40);
        System.out.println("The area of a Square with width 40 is " + sq1.getArea());
        System.out.println("The perimeter of a Square with width 40 is " + sq1.getPerimeter());
        Square sq2 = new Square(35.9);
        System.out.println("The area of a Square with width 35.9 is " + sq2.getArea());
        System.out.println("The perimeter of a Square with width 35.9 is " + sq2.getPerimeter());
    }
}