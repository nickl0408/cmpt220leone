
public class Lab4five {

	public static void main(String[] args) {
		int[] nums = new int[1001];
		for (int i = 0; i < 1001; i++) {
			nums[i] = generateNum();
		}
		
		double average = mean(nums);
		
		int countBelow = 0;
		int countAbove = 0;
		
		for (int i = 0; i < 1000; i++) {
			if(nums[i] < average) {
				countBelow++;
			}
			else if(nums[i] > average) {
				countAbove++;
			}
		}
		System.out.println("The average of the 1000 numbers is: " + average);
		System.out.println("The amount of numbers above the average is: " + countAbove);
		System.out.println("The amount of numbers below the average is: " + countBelow);

	}
	
	public static int generateNum() {
		int s = (int)(Math.random() * 10);
		return s;
	}
	
	public static double mean(int[] x) {
		double mean = 0;
		for (double e: x) {
			mean += e;
		}
		return mean / x.length;
	}
}
