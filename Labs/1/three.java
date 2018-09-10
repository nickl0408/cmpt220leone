import java.util.Scanner;

public class three {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value for ounces");
		double ounces = input.nextDouble();
		double grams = ounces * 28.35;
		
		System.out.print("That value in grams is" + grams);

	}

}
