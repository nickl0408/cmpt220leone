public class Toaster extends Appliance {

    private String type;
    private int size;
    private String shape;
    
    
    public Toaster(double voltage, String color, String madeIn, double price, String type, int size, String shape)
    {
        super(voltage,color,madeIn,price);
        this.type = type;
        this.size = size;
        this.shape = shape;
    }
    
    public Toaster()
    {
        super(0,"","",0);
        this.type = "";
        this.size = 0;
        this.shape = "";
    }
    
    public String getType(){
        return type;
    }
    public int getSize(){
        return size;
    }
    public String getShape(){
        return shape;
    }
    
    
    
}