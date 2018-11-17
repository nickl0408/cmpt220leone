public class TV extends Appliance {

    private String model;
    private double size;
    private int number;
    
    
    public TV(double voltage, String color, String madeIn, double price, String model, double size, int number)
    {
        super(voltage,color,madeIn,price);
        this.model = model;
        this.size = size;
        this.number = number;
    }
    
    public TV()
    {
        super(0,"","",0);
        this.model = "";
        this.size = 0;
        this.number = 0;
    }
    
    public String getModel(){
        return model;
    }
    public double getSize(){
        return size;
    }
    public int getNumber(){
        return number;
    }
    
    
    
}