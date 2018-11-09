import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) throws IOException {

		String i = args[1];
		String o = "newText.txt";
		String d = args[0];

		File file = new File(i);
		FileWriter f = new FileWriter(o);

  

  

try {

	Scanner s = new Scanner(file);
	while (s.hasNextLine()) {
		String j = s.next();
		if(!j.equals(d)) f.write(j + "\r\n");

	}

	f.close();
	s.close();
	
	System.out.println(d + " has deleted from the file "+ i +" resultant has writen to " + o);

	}

	catch (FileNotFoundException e) {

		e.printStackTrace();

		}

	}

}