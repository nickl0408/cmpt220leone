public abstract class Employee {
	String name;
	double age;
 	double hourRate;
 	public abstract double salary(double hours);
 	public String toString() {
 		return "name= " + name + " age=" + age + " hourRate=" + hourRate;
 	}
}

class Manager extends Employee {
	public Manager(String n, int a, int h) {
		super.name = n;
		super.age = a;
		super.hourRate = h;
	}
	
	@Override
	public double salary(double hours) {
		return super.hourRate * hours;
	}
	
}

class Clerk extends Employee {
	public Clerk(String n, int a, int h) {
		super.name = n;
		super.age = a;
		super.hourRate = h;
	}

	@Override
	public double salary(double hours) {
		return super.hourRate * hours;
	}
}