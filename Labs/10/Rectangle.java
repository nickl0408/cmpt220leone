interface Printable{
public void print();

}
class Rectangle implements Printable {
	private int length,width;

	public Rectangle(int length,int width) {
		this.length = length;
		this.width = width;
	}
	public void print() {

		System.out.println("Rectangle : length : "+length+" width : "+width +" Area : "+length*width);
  
		}
	}

class SportCar implements Printable {
	private String name;
	private long number;

	public SportCar(String name,long number) {
		this.name = name;
		this.number = number;
	}

public void print() {
	System.out.println("Sports Car : Name : "+name +" Number : "+number);
	
		}
	}

class Manager implements Printable {

	private String name;
	private long deptNumber;

public Manager(String name,long deptNumber) {
	this.name = name;
	this.deptNumber = deptNumber;

	}

public void print() {
	
	System.out.println("Manager : Name :"+name +" Department Number : "+deptNumber);
	
	}
}
