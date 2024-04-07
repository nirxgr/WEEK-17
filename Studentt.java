import java.util.ArrayList;
public class Studentt{
    //creating instance variables
    String name;
    String group;
    String phone;
    //creating a constructor
    public Studentt(String name,String group,String phone){
        this.name=name;
        this.group=group;
        this.phone=phone;
    }
    
    //setter method for each attribute
    public void setName(String name){
        this.name=name;
    }
    public void setGroup(String group){
        this.group=group;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    
    //getter method for each attribute
    public String getName(){
        return this.name;
    }
    public String getGroup(){
        return this.group;
    }
    public String getPhone(){
        return this.phone;
    }
    
    public static void main(String[]args){
        
    // Create an ArrayList to store Studentt class objects
    ArrayList <Studentt> students = new ArrayList <Studentt>();
    

    
    
    //creating objects
    Studentt stud1 = new Studentt("Ayush","L1N1","9876543210");
    Studentt stud2 = new Studentt("Rahul","L1M1","9876543211");
    Studentt stud3 = new Studentt("Gaurav","L1N2","9876543212");
    
    //adding objects in arraylist
    students.add(stud1);
    students.add(stud2);
    students.add(stud3);
    
    //iii.adding a new student
    Studentt newStud = new Studentt("Aavya","L1C1","9876543213");
    students.add(0,newStud);
    
    //ii.removing gaurav from list
    students.remove(3);
    
    
    //v. Changing name of“Ayush” to “Aayush”
    students.get(1).setName("Aayush");

    // iv.Change the group of Rahul from “L1M1” to “L1N2”
    students.get(2).setGroup("L1N2");
    
    //using for each loop to display
    for(Studentt stu : students){
        System.out.println("Name: "+stu.name+" Group: "+stu.group+" Phone: "+stu.phone);
    }
    }
}