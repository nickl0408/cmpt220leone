import java.util.Scanner;
public class Lab4eight 
{
    public static void main(String[] args) 
    {
        int k, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements you want in array. You can do a maximum of 100:");
        k = s.nextInt();
        int a[] = new int[k];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < k; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < k; i++) 
        {
            for (int j = i + 1; j < k; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) // JA: Where is n defined?
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}