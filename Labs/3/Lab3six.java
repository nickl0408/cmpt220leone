import java.util.Scanner;
public class Lab3six {
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please type a string: ");
        String string = in.nextLine();

        System.out.print("The number of vowels in the string: " + numberOfVowels(string)+"\n");
    }
 public static int numberOfVowels(String str)
    {
        int num = 0;
        for (int j = 0; j < str.length(); j++)
        {
            if (str.charAt(j) == 'a' || str.charAt(j) 
            	== 'e' || str.charAt(j) == 'i'|| str.charAt(j) == 'o'
            	|| str.charAt(j) == 'u')
            {
                num++;
            }
        }
        return num;
    }
}