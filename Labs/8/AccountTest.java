
class AccountTest {
	
	public static void main(String[] args) {
		
		Account a = new Account(1001, 500, 2.1, "04-30-2001");

		Checking ca = new Checking(1010, 1000, 3.2, "09-21-2000");
		
		Savings sa = new Savings(1003, 750, 4.9, "05-11-2010");
		System.out.println(a.toString());
		System.out.println(ca.toString());
		System.out.println(sa.toString());
	}
}