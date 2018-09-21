
public class Lab3two {

	public static void main(String[] args) {
		int line = 11;
		int num = 0;
		for (int j = 100; j <= 500; j++) {
			if (j % 35 == 0)
			num++;
			else if (j % 5 == 0 || j % 7 == 0) {
			num++;
				if (num % line == 0) 
					System.out.println(j);
				else 
					System.out.print(j + " ");		
				}
			}
	}
	
}