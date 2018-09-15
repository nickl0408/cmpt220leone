import java.util.Scanner;

public class Lab2one {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter two integers ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
			
		if (num1 < num2) 
				System.out.print(num1 + " is less than " + num2 + ". true");
			else if (num1 >= num2) 
				System.out.println(num1 + " is less than " + num2 + ". false");
		
		if (num1 <= num2) 
			System.out.println(num1 + " is less than or equal to " + num2 + ". true");
		else if (num1 > num2) 
			System.out.println(num1 + " is less than or equal to " + num2 + ". false");
		
		if (num1 == num2) 
			System.out.println(num1 + " is equal to " + num2 + ". true");
		else if (num1 != num2) 
			System.out.println(num1 + " is equal to " + num2 + ". false");
		
		if (num1 != num2) 
			System.out.println(num1 + " is not equal to " + num2 + ". true");
		else if (num1 == num2) 
			System.out.println(num1 + " is not equal to " + num2 + ". false");
		
		if (num1 > num2) 
			System.out.println(num1 + " is greater than " + num2 + ". true");
		else if (num1 <= num2) 
			System.out.println(num1 + " is greater than " + num2 + ". false");
		
		if (num1 >= num2) 
			System.out.println(num1 + " is greater than or equal to " + num2 +
					". true");
		else if (num1 < num2) 
			System.out.println(num1 + " is greater than or equal to " +
		num2 + ". false");
		
		
	}

}
