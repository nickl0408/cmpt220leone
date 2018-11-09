import java.util.Scanner;

public class Lab9one {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = getArray();

		System.out.print("Please enter the index of an array ");
		
		try {
			System.out.println("The array value is " + 
				array[input.nextInt()]);
		}
		
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
		
	}

	public static int[] getArray() {
		int[] array = new int[100];
		for (int n = 0; n < array.length; n++) {
			array[n] = (int)(Math.random() * 100) + 1;
		}
		return array;
	}
}