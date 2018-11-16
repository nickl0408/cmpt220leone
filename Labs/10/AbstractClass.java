public abstract class AbstractClass {
	
	public AbstractClass() {
		
	}	
	
	public abstract void printMessage();
	
}

class Subone extends AbstractClass {

	@Override
	public void printMessage() {
		System.out.print("This is first subclass");

	}
	
}
class Subtwo extends AbstractClass {

	@Override
	public void printMessage() {
		System.out.print("This is second subclass");
	}

	
	
}