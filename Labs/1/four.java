import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a value for Mass in kilograms ");
		double Mass = input.nextDouble( );
		
		final double C = 299972458;
		
		double C2 = Math.pow(C, 2);
		double E = Mass * C2;
		
		System.out.print("E =" + E);
		
		
		
	
	}

}