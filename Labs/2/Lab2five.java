import java.util.Scanner;

public class Lab2five {

	public static void main(String[] args) {
		
		String wd1, wd2;
	    Scanner input = new Scanner(System.in);

	    System.out.println ("Please type a string ");
	    String string1 = input.nextLine();

	    System.out.println ("Please type another string ");
	    String string2 = input.nextLine();
		
	    int compare = string1.compareTo(string2);


	    if (compare < 0)
	    {System.out.println(string1 + " " + string2);}
	    else {
	        if (compare > 0)
	        {System.out.println(string2+ " " + string1);}

	    }
	}
}

