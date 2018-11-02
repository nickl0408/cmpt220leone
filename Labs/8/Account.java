public class Account {
	int accNumber;
	double balance;
	double annualInterestRate;
	String dateCreated;

public Account(int accNumber, double balance, double annualInterestRate, String dateCreated) {
	this.accNumber = accNumber;
	this.balance = balance;
	this.annualInterestRate = annualInterestRate;
	this.dateCreated = dateCreated;
	
	}

	public void deposit(double amount) {
	
	balance = balance + amount;
	
	}

	public void withdraw(double amount) {
	
	balance = balance - amount;
	
	}

public String toString() {
	String r = "";
	r += "Account number : " + accNumber + "\n";
	r += "Balance is : " + balance + "\n";
	r += "Annual Interest Rate is : " + annualInterestRate + "\n";
	r += "Date created is : " + dateCreated + "\n";
	
return r;

	}
}