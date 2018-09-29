import java.util.Scanner;
public class Lab4seven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] integerList = new int[10]; 

		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < integerList.length; i++) {
			integerList[i] = input.nextInt();
		}
			
		int[] distinctNumbers = eliminateDuplicates(integerList);
			
		System.out.print("The distinct numbers are:");
		for (int i = 0; i < distinctNumbers.length; i++) {
			if (distinctNumbers[i] > 0)
				System.out.print(" " + distinctNumbers[i]);
			}
		}
		

		
		
	
		public static int[] eliminateDuplicates(int[] list) {
			int[] distinctNums = new int[list.length];
			int i = 0;
			for (int n = 0; n < list.length; n++) {
				if (searchArray(distinctNums, list[n]) == -1) {
					distinctNums[i] = list[n];
					i++;
				}
			}
			return distinctNums;
		}

		public static int searchArray(int[] array, int num) {
			for (int i = 0; i < array.length; i++) {
				if (num == array[i])
					return i;
			}
				return -1;
		}
}