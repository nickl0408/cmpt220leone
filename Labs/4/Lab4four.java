import java.util.Scanner;

public class Lab4four {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a string");
		String s = input.nextLine();
         
        getChar(s); 

	}
    static final int max = 256; 
    
    static void getChar(String s) 
    {  
        int count[] = new int[max]; 
  
        int len = s.length();  
        for (int i = 0; i < len; i++) 
            count[s.charAt(i)]++;  
        char ch[] = new char[s.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = s.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
  
                if (s.charAt(i) == ch[j])  
                    find++;                 
            } 
  
            if (find == 1)  
                System.out.println("Number of Occurrence of " + 
                 s.charAt(i) + " is:" + count[s.charAt(i)]);             
        } 
    } 

}
