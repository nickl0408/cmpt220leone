public abstract class Appliance implements Comparable<Appliance>{
	private String color;
	private double voltage;
 	private double price;
 	private String madeIn;
 	
 	public Appliance(double voltage, String color, String madeIn, double price)
 	{
 	    this.color = color;
 	    this.voltage = voltage;
 	    this.price = price;
 	    this.madeIn = madeIn;
 	}
 	
 	public double getVoltage(){
 	    return voltage;
 	}
 	
 	public String getColor(){
 	    return color;
 	}
 	
 	public String getMadeIn() {
 	    return madeIn;
 	}
 	
 	public double getPrice(){
 	    return price;
 	}
 	
 	public void setPrice(double price){
 	    this.price = price;
 	}
 	
 	@Override
	public int compareTo(Appliance a) {
        
        if (this.price > a.getPrice())
            return 1;
        else if (this.price < a.getPrice())
            return -1;
        else
            return 0;
	}
 	
 	public String toString(){
 	    
 	    return "Color: "+color +", Voltage: " + voltage + "," + "Made In: " +madeIn+ "," + "Price: " +price;
 	    
 	}
}