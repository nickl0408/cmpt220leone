import java.util.Scanner;

public class Lab5one {

static final int most = 10;

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        double[] nums = new double [most];
      
        System.out.print("Enter " + most + " numbers: ");
        
        for (int j = 0; j < nums.length; j++)
            nums[j] = input.nextDouble();
        		System.out.println("The largest number is " + max(nums));
        		
    }

    public static double max(double[] array) {

    	double max = array[0];
        for (int j = 1; j < array.length; j++) {
        	if (array[j] > max) {
        		max = array[j];
        	}
        }
        return max;
    }
}