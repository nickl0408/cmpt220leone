
public class Lab9three {
	
	public static int bin2Dec(String binaryString) throws NumberFormatException {
		
		int d = 0;
		
		for (int x = 0, z = binaryString.length() - 1; 
			
			x < binaryString.length(); x++, z--) {
	
				if (binaryString.charAt(x) < '0' || binaryString.charAt(x) > '1') 
					
					throw new NumberFormatException ("The string is not a binary string");
				
				d += (Integer.parseInt(String.valueOf(binaryString.charAt(x)))) * Math.pow(2, z);
		}
		return d;
	} 
}