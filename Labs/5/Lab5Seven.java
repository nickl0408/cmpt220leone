import java.util.Scanner;

public class Lab5Seven {
	
    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
        boolean isUpperTriangle = true;
        
        System.out.println("Enter the number of rows ");
        int r = input.nextInt();
        
        System.out.println("Enter the number of columns : ");
      	int c = input.nextInt();
      	 
      		int inputArray[][] = new int[r][c];
      		
      	 		for (int i = 0; i < r; i++) {
      	 			for (int j = 0; j < c; j++) {
      	 					System.out.println("Please enter a value for array[" + 
      	 							(i + 1) + "," + (j + 1) + "] : ");
                
      	 						inputArray[i][j] = input.nextInt();
      	 				}
      	 			}
        
      	 System.out.println(" ");
     			for (int i = 0; i < r; i++) {
   	 				for (int j = 0; j < c; j++) {
          				System.out.print(inputArray[i][j] + "\t");
            }
            System.out.println();
     			}
     			for (int i = 0; i < r; i++) {
     				for (int j = 0; j < i; j++) {
     					if (inputArray[i][j] != 0) {
     						isUpperTriangle = false;
     							break;
     					}
     				}
            if (!isUpperTriangle) {
                break;
            }
        }
        if(isUpperTriangle){
            System.out.println("That is an upper triangular matrix");
        }else{
            System.out.println("That is not an upper triangular matrix");
        }
    }
}