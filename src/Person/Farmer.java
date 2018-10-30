package Person;
import Plant.*;
import Plant.Seed.CornSeed;
import Plant.Seed.PastureSeed;
import Plant.Seed.RiceSeed;

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

    public void acceptEmployeeVisit(EmloyeeNumberVisitor visitor){
        visitor.visit(employeeNumber);
    }

    public void raiseEveryAnimal(){ // facade
        Employee employee = employSomeOne();
        System.out.println("The farmer find himself an employee to help him");
        employee.raisePig();
        employee.raiseChicken();
        employee.raiseFish();
        employee.raiseSheep();
    }

    public void produceAnimal(String method){ // proxy
        Employee employee = employSomeOne();
        System.out.println("An employee become the proxy of the farmer");
        employee.produceAnimal(method);
    }


    public void shopSomeSeeds(){ // shop all kinds of seeds
        CornSeed.count += 3;
        PastureSeed.count += 3;
        RiceSeed.count += 3;

        System.out.println("You just bought 3 corn seeds");
        System.out.println("You just bought 3 pasture seeds");
        System.out.println("You just bought 3 rice seeds");
    }

    public void showPlantProduct(){
        System.out.println("\nLet's see what we have in the storage now.");
        System.out.println("Pasture seeds: " + PastureSeed.count + "\tPasture product : " + PastureProduct.count);
        System.out.println("Corn seeds: " + CornSeed.count + "\t\tCorn product : " + CornProduct.count);
        System.out.println("Rice seeds: " + RiceSeed.count + "\t\tRice product : " + RiceProduct.count);
    }

}