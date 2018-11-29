import java.util.Scanner;

public class Lab11_17 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		System.out.print("Please enter a list of characters in a line ");
		
		String str = input.nextLine();
		
		char[] chars = new char[str.length() - 1];
		
		for (int j = 0; j < chars.length; j++)
		
			chars[j] = str.charAt(j);
		
		char ch = str.charAt(str.length() - 1);

		
		System.out.println("The character \"" + ch + "\" occurs " + count(chars, ch) + " times in this list \"" + str.substring(0, str.length() - 1) + "\".");
	
	}

	
	public static int count(char[] chars, char ch) {
		
		return count(chars, ch, chars.length - 1);
		
	}

	
	public static int count(char[] char1, char cha, int base) {
		
		if (base < 0)
			
			return 0;
		
		else if (char1[base] == cha) 
			
			return 1 + count(char1, cha, base - 1);
		
		else
			
			return count(char1, cha, base - 1); 
		
	}
	
}