
public class MyLong {
	private long value;
	public MyLong(long value) {
		this.value = value;
	}
	
	public long getLong() {
		return value;
	}
	
	public boolean isEven() {
		return (value % 2) == 0;
				
	}
	
	public boolean isOdd() {
		return (value % 2) == 1;
	}
	
	public boolean isPrime() {
		for (long i = value - 1; i > 1; i--) {
			if (value % i == 0) {
				return false;
			}
			
		}
		return true;
	
	}
	
	public static boolean isEven(long value) {
		return (value % 2) == 0;
		
	}
	
	public static boolean isOdd(long value ) {
		return (value % 2) == 1;
	}
	
	public static boolean isPrime(long value) {
		for (long i = value - 1; i > 1; i--) {
			if (value % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	
	public static boolean isEven(MyLong value) {
		return value.isEven();
		
	}
	
	public static boolean isOdd(MyLong value ) {
		return value.isOdd();
	}
	
	public static boolean isPrime(MyLong value) {
		return value.isPrime();
	}
	
	public boolean equals(long value) {
		return this.value == value;
	}
	
	public boolean equals(MyLong value) {
		return this.value == value.getLong();
	}
	
	public static long parseLong(char[] value) {
		long output = 0;
		for (int i = 0; i < value.length; i++) {
			long temp = (long)(value[i] + '0');
			output = (output * 10) + temp;
		}
			return output;
	}
	public static long parseLong(String value) {
		char[] temp = new char[value.length()];
		
		for(int i=0;i<temp.length;i++) {
			temp[i] = value.charAt(i);
		}
		
		return parseLong(temp);
		
	}
	
}
