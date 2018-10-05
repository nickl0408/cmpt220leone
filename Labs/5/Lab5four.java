import java.util.Scanner;

public class Lab5four {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string");
		String input1 = input.nextLine();
		System.out.println("Please enter another string");
		String input2 = input.nextLine();
		
		String[] string1 = input1.split(" ");
		String[] string2 = input2.split(" ");
		 
		int[] array1 = new int[string1.length];
		int[] array2 = new int[string2.length];
		
		for (int i = 0; i < string1.length; i++) {
			array1[i] = Integer.parseInt(string1[i]);
			
		}

		for (int i = 0; i < string2.length; i++) {
			array2[i] = Integer.parseInt(string2[i]);
			
		}
		
		if (equal(array1,array2)) {
		System.out.println("These strings are the same"); 
		
		}
		else {
			System.out.println("These strings are not the same");
		}
	}
	
	public static boolean equal(int[] x, int[] y) {
		if (x.length != y.length) {
			return false;
		}
		else {
			boolean check = false;
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < y.length; j++) {
					check = x[i] == y[j];
					if (check) {
						break;
					}
				}
				
				if(!check) {
					return false;
				}
			}
			
			return true;
		}
	}
}
