import java.util.ArrayList;
import java.util.Iterator;
public class BusCompany
{
    private ArrayList<Buss> busList;
    
    public BusCompany()
    {
        busList = new ArrayList<Buss>();
    }
    
    public void addBus(Buss bus)
    {
        busList.add(bus);
    }
    
    public void removeBus(int index)
    {
        /*n to remove using object name itself
         Iterator<Buss> itr = busList.iterator();
        
        boolean removed = false;
        while(itr.hasNext()) 
        {
            if (itr.next() == bus)
            {
                itr.remove();
                removed = true;
                System.out.println("Object has been removed");
            }
        }
        if (removed == false)
        {
            System.out.println("Error, Object not found");
        }
        */
       
       // to remove using index
       if(index >=0 && index < busList.size())
       {
           busList.remove(index);
           System.out.println("Item has been removed");
       }
       else
       {
           System.out.println("Index out of range");
       }
    }
    
    public void displayInfo()
    {
        for(Buss bus : busList)
        {
            System.out.println(bus.getNumberPlate());
            System.out.println(bus.getColor());
            System.out.println(bus.getRoute());
            System.out.println(bus.getCustomerName());
            System.out.println(bus.getAvailableStatus());
            System.out.println(bus.getRate());
            System.out.println("");
        }
    }
    
    public void expensive()
    {
        for(Buss bus : busList)
        {
            if(bus.getRate() > 500)
            {
                System.out.println(bus.getNumberPlate());
                System.out.println(bus.getColor());
                System.out.println(bus.getRoute());
                System.out.println(bus.getCustomerName());
                System.out.println(bus.getAvailableStatus());
                System.out.println(bus.getRate());
                System.out.println("");
            }
        }
    }
    
    public void colored()
    {
        for(Buss bus : busList)
        {
            if(bus.getColor() == "Red" || bus.getColor() == "Blue")
            {
                System.out.println(bus.getNumberPlate());
                System.out.println(bus.getColor());
                System.out.println(bus.getRoute());
                System.out.println(bus.getCustomerName());
                System.out.println(bus.getAvailableStatus());
                System.out.println(bus.getRate());
                System.out.println("");
            }
        }
    }
    
    
}