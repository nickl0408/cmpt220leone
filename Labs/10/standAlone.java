import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.List;

public class standAlone {
    
    public static void main(String[] args) {
        
        ArrayList<Appliance> list = new ArrayList<Appliance>();
        
        Random rand = new Random();
        String[] colors = new String[] {"White","Black","Orange","Blue"};
        String[] places = new String[] {"Japan", "USA", "SouthAmerica", "Asia"};
        String[] shapes = new String[] {"Square", "Circle", "Oval", "Cube"};
        
        for (int i = 0; i < 40; i++)
        {
            int randCol = rand.nextInt(4);
            String color = colors[randCol];
            double voltage = rand.nextDouble()*120;
            double price = rand.nextDouble()*100;
            int randMade = rand.nextInt(4);
            String madeIn = places[randMade];
            
            int j = rand.nextInt(3)+1;
            
            //creates a TV object
            if ( j == 1)
            {
                String model = j * randCol + "AB-324";
                double size = rand.nextDouble()*55;
                int number = rand.nextInt(10);
                TV newTV = new TV(voltage,color,madeIn,price,model,size,number);
                list.add(newTV);
            }
            
            //creates a toaster
            if ( j == 2)
            {
                String type = j * randCol + "AB-324";
                int size = rand.nextInt(20);
                int randSh = rand.nextInt(4);
                String shape = shapes[randSh];
                Toaster newToaster = new Toaster(voltage,color,madeIn,price,type,size,shape);
                list.add(newToaster);
            }
            
            //creates a telephone
            if ( j == 3)
            {
                String type = j * randCol + "US-321";
                int size = rand.nextInt(15);
                int randSh = rand.nextInt(4);
                String shape = shapes[randSh];
                Telephone newTelephone = new Telephone(voltage,color,madeIn,price,type,size,shape);
                list.add(newTelephone);
            }
        }
        
        System.out.println("Before sorting by price:");
        System.out.println(list);
        //sort that uses the method compareTo created on Appliance
        Collections.sort((List<T>) list);
        System.out.println("After sorting by price:");
        System.out.println(list);

        
    }

}