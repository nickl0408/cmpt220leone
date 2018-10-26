public class CircleTest {
	public static void main(String[] args) {

		Circle c1 = new Circle(2, 2, 5.5);

		System.out.println("Area of the Circle " + c1.getArea()); 
		System.out.println("Perimeter of the Circle " + c1.getPerimeter()); 
		System.out.println(
			"Does the circle contain the point (3, 3)? " + c1.contains(3, 3)); 
		System.out.println(
			"Does the circle contain the circle centered at (4, 5) and radius 10.5? " + c1.contains(new Circle(4, 5, 10.5)));
		System.out.println(
			"Does circle1 overlap the circle centered at (3, 5) and radius 2.3? " + c1.overlaps(new Circle(3, 5, 2.3)));
	}
}
