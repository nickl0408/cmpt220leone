import java.util.Scanner;
class Lab5six {
	 static int a;
	 static int b;
	    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Please enter your rows and columns please ");
        int x = input.nextInt();
        a = x;
        int y = input.nextInt();
        b = x;
        System.out.print("Enter your matrix");
        
        int[][] array = new int[a][b];
        
      for (int i = 0; i < b; i++) {
        for (int j = 0; j < a; j++) {
           array[i][j] = input.nextInt();
               System.out.print(array[i][j] + " ");
            }
            System.out.println();
      }
      averageRow(array);
    }
  
	// JA: This method should also take the column for the average calculation
    public static void averageRow(int[][] array) {
        int sum= 0;
        int rowSize = array.length;
        int columnSize = array[0].length;
        System.out.println("rows=" + rowSize + "cols=" + columnSize);
        
        int[] colSum =new int[array[0].length];
        for (int i = 0; i < array.length; i++){   
            for (int j = 0; j < array[i].length; j++){                
                sum += array[i][j];
                colSum[j] += array[i][j];
            }
          
        }  
        for(int k=0;k<colSum.length;k++){
            System.out.println("Thhe sum of columns =" + colSum[k]);
        } 
    
            
    }
}