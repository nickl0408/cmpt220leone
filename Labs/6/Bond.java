
public class Bond {

	private double coupon;
	private double interest;
	private double valueMaturity;
	private int payments;
	
	public Bond() {
        
    }
	
	public Bond(double coupon, double interest, int payments, double valueMaturity) {
        this.coupon = coupon;
        this.interest = interest;
        this.payments = payments;
        this.valueMaturity = valueMaturity;
        	
    }
	
	public double getPrice() {
		return coupon * (1 - (1 / Math.pow(1 + interest, payments))) + valueMaturity * (1 /  Math.pow(1 + interest, payments));
	}
	
}
