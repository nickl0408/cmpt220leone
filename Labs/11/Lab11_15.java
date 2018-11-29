import java.util.Scanner;

public class Lab11_15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter a string and a character ");
		String[] str = input.nextLine().split("[ ]");

		System.out.println("The character '" + str[1] + "' occurs " +
			count(str[0], str[1].charAt(0)) + " times in \"" + str[0] + "\".");
	}

	public static int count(String str, char a) {
		return count(str, a, str.length() - 1);
	}

	private static int count(String string, char i, int base) {
		if (base < 0) 
			return 0;
		else if (string.charAt(base) ==  i) {
			return 1 + count(string, i, base - 1); 
		}
		else
			return count(string, i, base - 1);
	}
}