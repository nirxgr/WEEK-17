import java.util.ArrayList;
import java.util.Iterator;
//creating class
public class Names{
    //creating main method
    public static void main(String[]args){
        //creating an array list to store the names
        ArrayList <String> names = new ArrayList <String>();
        
        //adding the names to array list
        names.add("Niraj");
        names.add("Ronaldo");
        names.add("Messi");
        
        names.add(1,"Bish");
        
        /*using for loop to display the names
        for(String name:names){
           System.out.println(name);
        }*/
        
        //using iterator interface to display the names
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}