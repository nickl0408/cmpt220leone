import java.util.Scanner;

public class Lab5two {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] nums = new double[10];
		
		System.out.print("Enter 10 random numbers ");
		for (int j = 0; j < nums.length; j++)
			nums[j] = input.nextDouble();
			
			System.out.println("The mean of the numbers is " + mean(nums));
			System.out.println("The standard deviation of the numbers is " + deviation(nums));
			
		}
		public static double deviation(double[] x) {
			double deviation = 0;
			double mean = mean(x);
			for (double e: x) {
				deviation += Math.pow(e - mean, 2);
				
			}
			
			return Math.sqrt(deviation / (x.length - 1));
		}
		
		public static double mean(double[] x) {
			double mean = 0;
			for (double e: x) {
				mean += e;
			}
			return mean / x.length;
		}

}