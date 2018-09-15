import java.util.Scanner;

public class Lab2threee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please type a low limit integer");
		
		
		int lowerbound = input.nextInt();
		
		System.out.print("Please typer a upper bound");
		
		int upperbound = input.nextInt();
		
		int random = (int)(Math.random() * (upperbound - lowerbound)) + lowerbound;
		int random2 = (int)(Math.random() * (upperbound - lowerbound)) + lowerbound;
		int random3 = (int)(Math.random() * (upperbound - lowerbound)) + lowerbound;
		
		System.out.print("Three random numbers between " + upperbound + " and " + lowerbound 
				+ " are " + random + " " + random2 + " and "+ random3);
	
		
	}

}
