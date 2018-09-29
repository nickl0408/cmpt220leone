import java.util.Random;

public class Lab4two {
	
	public static void main(String[] args) {
		printMatrix(5);
		
	}
	public static void printMatrix(int r) {
		for (int rows = 0; rows < r; rows++) {
			for (int cols = 0; cols < r; cols++) {
			printLetter();
			
		}
		
		System.out.println();
		}
	}
	
	public static void printLetter() {
		final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	    int r = (int)(Math.random() * 26);
	    System.out.print(alphabet.charAt(r));
	    
	}
	

}
