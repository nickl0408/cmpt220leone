import java.util.Scanner;

// JA: You should have some commments about the logic
public class Project1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String read1 = input.nextLine();
		String read2 = input.nextLine();
		
		String[] input1 = read1.split(" ");
		String[] input2 = read2.split(" ");
		
		int height = Integer.parseInt(input1[0]);
		int width = Integer.parseInt(input1[1]);
		int number = Integer.parseInt(input1[2]);
		
		int[] bricks = new int[number];
		
		for (int i = 0; i< number; i++) {
			bricks[i] = Integer.parseInt(input2[i]);
		}
				
		int currentH = 0;
		int currentW = 0;
		
		for (int i = 0; i < number; i++) {
			currentW = currentW + bricks[i];
			
			if (currentW > width) {
				break;
				
			}
			
			if (currentW == width) {
				currentH += 1;
				currentW = 0;
			}
				
		}
		
		
		if (currentH >= height) {
			System.out.print("YES");	
		}
		
		else {
			System.out.print("NO");
		}
	
	}
		
}
