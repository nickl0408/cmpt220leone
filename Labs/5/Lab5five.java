import java.util.Scanner;

public class Lab5five {

    static int a;
    static int b;
    static int[][] trans_arr = new int[a][b];

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
        int[][] trans_array = new int[a][b];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                trans_array[j][i] = array[i][j];
                System.out.println(" ");
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(trans_array[i][j] + " ");

            }
            System.out.println();
        }

    }

}