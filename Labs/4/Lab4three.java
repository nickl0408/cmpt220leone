
import java.util.Scanner;

public class Lab4three {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 

		System.out.print("Enter an integer ");
		String s = input.nextLine();
		String reverse = new StringBuffer(s).reverse().toString();
		if (s.equals(reverse))
	         System.out.println("The string is a palindrome.");
	      else
	         System.out.println("The string isn't a palindrome.");
	}

	
	public static boolean isPalin(String s) {
		return s == reverse(s) ? true : false;
	}

	
	public static String reverse(String s) {
		String reverse = ""; 	
		String n = s + ""; 
	
		for (int j = n.length() - 1; j >= 0; j--) {
			reverse += n.charAt(j);
			}
		 
		return reverse;
		
		}
	}