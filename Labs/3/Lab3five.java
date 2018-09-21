import java.util.Scanner;

public class Lab3five {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter three numbers");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		System.out.print("The average is " + averageNumbers(a, b, c) + "\n" );
	}
		
		public static double averageNumbers(double a, double b, double c)
		{
			return (a + b + c) / 3;
		
	}

}
