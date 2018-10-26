import java.util.Scanner;

public class StackOfIntegers {
	  private int[] e;
	  private int size;

	  public StackOfIntegers() {
	    this(16);
	  }

	  public StackOfIntegers(int capacity) {
	    e = new int[capacity];
	  }
	  public int push(int value) {
	    if (size >= e.length) {
	      int[] temp = new int[e.length * 2];
	      System.arraycopy(e, 0, temp, 0, e.length);
	      e = temp;
	    }

	    return e[size++] = value;
	  }

	  public int pop() {
	    return e[--size];
	  }

	  public int peek() {
	    return e[size - 1];
	  }

	  public boolean empty() {
	    return size == 0;
	  }

	  public int getSize() {
	    return size;
	  }
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a positive number ");
		int num = input.nextInt();

		
		System.out.print("The smallest factors of " + num + " are ");
		
		StackOfIntegers stack = new StackOfIntegers(); 

		smallestFactors(num, stack);

		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
	}

	
	/** Find smallestFactors and push them to StackOfIntegers */
	public static void smallestFactors(int number, StackOfIntegers stack) {
		int i = 2; // Potential prime factor
		while (number / i != 1){ 
			if (number % i == 0) {
				stack.push(i);
				number /= i;
			}
			else
				i++;
		}
		stack.push(number);
	}
}