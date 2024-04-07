import java.util.ArrayList;
import java.util.Iterator;
public class NumbName{
    //main method
    public static void main(String[]args){
        // Create an ArrayList numbers to store numbers
        ArrayList <Integer> numbers = new ArrayList <Integer>();
        //adding the numbers to array list
        numbers.add(23);
        numbers.add(99);
        numbers.add(70);
        numbers.add(29);
        numbers.add(10);
        
        //storing the size of numbers array in size1 variable
        int size1 = numbers.size();
        //printing the size of size1 variable
        System.out.println(size1);
        
        //clearing all the items in numbers variable
        numbers.clear();

        
        //using for loop to display the names
        for(Integer numb : numbers){
           System.out.println(numb);
        }
        
    
        
        
        // Create an ArrayList names to store names
        ArrayList <String> names = new ArrayList <String>();
        //adding the names to array list
        names.add("Puja");
        names.add("Ojashwi");
        names.add("Akon");
        names.add("Taylor");
        names.add("Olivia");
        
        //removing a particular element (3rd element/ 2 index) from names array
        names.remove(2);
        
        
        //using get to retrieve a particular element (3rd element/ 2 index) from names array and storing it in a numb variable
        String numb = names.get(2);
        //printing the retrieved element
        System.out.println(numb);
        
        
        //using using iterator interface to display the names
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
        
        //storing the size of names array in size2 variable
        int size2 = names.size();
        //printing the size of size2 variable
        System.out.println(size2);
        
    }
}
