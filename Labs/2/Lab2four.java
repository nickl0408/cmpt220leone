import java.util.Scanner;

public class Lab2four {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first character ");
		double a = input.nextDouble();
		System.out.print("Enter the second character ");
		double b = input.nextDouble();
		double addition = (a+b);
		
		System.out.print("The sum of both numbers is " + addition);

	}

}
