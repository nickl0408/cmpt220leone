
public class Lab3three {

	public static void main(String[] args) {
		int ascii = 0;
		int line = 20;
		for (int i = 0; i<=100; i++) {
			System.out.print(Character.toString((char)ascii) + " ");
			ascii++;
			if (ascii % line == 0) 
				System.out.println();
		}

	}

}
