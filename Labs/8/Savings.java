class Savings extends Account{
	
public Savings(int accNumber, double balance, double annualInterestRate, String dateCreated) {
	super(accNumber, balance, annualInterestRate, dateCreated);
	
}


	public String toString() {
		String r = "Savings account Details\n";
		r += super.toString();
		return r;
		}
	}