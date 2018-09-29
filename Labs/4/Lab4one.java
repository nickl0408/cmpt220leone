public class Lab4one {

	public static void main(String[] args) {
		System.out.println(
				"\nin		cm		|      cm	     in");
		for (double in = 1.0, cm = 1; in <= 51.0; in++, cm +=5) {
				System.out.printf("%4.1f		", in);
				System.out.printf("%6.3f", inToCm(in));
				System.out.printf("		|	");
				System.out.printf("%-11.1f", cm);
				System.out.printf("%7.3f\n", cmToIn(cm));
		}
		
	}
	
	public static double inToCm(double in) {
		return 2.54 * in;
		
				
		}
				
	public static double cmToIn(double cm) {
		return 0.393701 * cm;
	}

}


