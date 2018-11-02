class Checking 
extends Account {

		public final double Limit = 100.00;

		public Checking(int accNumber, double balance, double annualInterestRate, String dateCreated) {
			super(accNumber, balance, annualInterestRate, dateCreated);

		}

		public void withdraw(double amount) {
		if (balance - amount <= Limit) {
			
				System.out.println("Sorry!!! Your balance cannot goes below " + Limit);
				
			} else {
				
				super.withdraw(amount);
			}
		}


		public String toString() {

			String r = "Checking account Details\n";
			r += super.toString();
			return r;
			}
	}