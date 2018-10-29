package Person;

import static Action.BreedAction.*;

// Singleton
public class Farmer extends People{
    private String name;
    private int employeeNumber;
    private static Farmer instance = new Farmer("Farmer509");

    private Farmer(String name){
        this.name = name;
        System.out.println("Person.Farmer \"" + this.name + "\" is successfully created!");
    }

    public static Farmer getTheFarmer(){
        return instance;
    }

    public Employee employSomeOne(){
        employeeNumber++;
        return Employee.getEmployee();
    }

    public int getEmployeeNumber(){
        System.out.println("You currently have " + employeeNumber + " employees!");
        return employeeNumber;
    }

    //sell items
//    void sellItem(String ItemName){ // Proxy
//        if (ItemName.equals("Egg")){
//            //sell egg
//
//        }
//        else if (){
//
//        }
//        // ...
//    }

    void shopSomeSeeds(){ // shop all kinds of seeds

    }
}