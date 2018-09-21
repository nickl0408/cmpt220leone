import java.util.Scanner;

public class Lab3onee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int even = 0;
		int odd = 0;
		int amount = 0;
		double total = 0;
		
		
		
		System.out.print("Enter a positive integer that, the input ends with a 0: ");
		int num = input.nextInt();
		
		if (num  == 0) {
			System.out.print("The only number entered was 0.");
			System.exit(1);
		}
		
		
		while (num != 0) {
			if (num % 2 == 0)
				even++;
			else
				odd++;
			
			total += num;
			amount++;
			num = input.nextInt();
			
			
		}
		
		
		double avg = total / amount;
		
		
		System.out.println(
			"The number of even numbers are " + even +
			"\nThe Total sum of the numbers is " + total +
			"\nThe average is " + avg);
		}

}