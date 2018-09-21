
public class Lab3seven {

	public static void main(String[] args) {
		System.out.println("The First 50 Pentegonal Numbers in Numerical Order are ");
		for (int j = 1; j < 51; j++) {
			System.out.printf("%4d " , getPent(j));
			if (j % 10 == 0)
				System.out.println();
			}

		}
	
	public static int getPent(int n) {
		return(n *(3 * n - 1)) / 2;
	}
}