package Person;
import Base.Animal;
import Item.Building.Building;
import Person.Order.RaiseChicken;
import Person.Order.RaiseFish;
import Person.Order.RaisePig;
import Person.Order.RaiseSheep;
import Plant.*;
import Plant.Seed.*;
import Item.AgricultureProducts.*;

import java.util.ArrayList;

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

    public void raiseEveryAnimal(){ // Facade
        Employee employee = employSomeOne();
        System.out.println("The farmer find himself an employee to help him");

        RaiseChicken rc = new RaiseChicken();
        RaiseFish rf = new RaiseFish();
        RaisePig rp = new RaisePig();
        RaiseSheep rs = new RaiseSheep();

        rc.execute();
        rp.execute();
        rf.execute();
        rs.execute();
    }

    public void produceAnimal(String method){ // Proxy
        Employee employee = employSomeOne();
        System.out.println("An employee become the proxy of the farmer");
        employee.produceAnimal(method);
    }

    public void shopSomeSeeds(){ // shop all kinds of seeds
        CornSeed.count += 3;
        PastureSeed.count += 3;
        RiceSeed.count += 4;

        System.out.println("You just bought 3 corn seeds");
        System.out.println("You just bought 3 pasture seeds");
        System.out.println("You just bought 4 rice seeds");
    }

    public void showPlantProduct(){
        plantApp.show();
    }

    public void showAnimalProcut(){
        System.out.println("Eggs Number: " +Eggs.amount);
        System.out.println("ChikenMeat: " + Chickenmeat.amount);
        System.out.println("Fishmeat Number: " + Fishmeat.amount);
        System.out.println("Mutton Number: " + Mutton.amount);
        System.out.println("Pork Number: " + Pork.amount);
    }

    public Building buildBuilding(){
        Building building = new Building.Builder()
                .setHeight(100)
                .setLength(100)
                .setWidth(100)
                .construct();
        System.out.println("We have constructed a new building!");
        return building;
    }

    public void getAnimalNumber(){
        System.out.println("The Chicken, Fish, Sheep, Pig Number is:");

        AnimalList animalList = new AnimalList();
        for(AnimalList.Interator iter = animalList.getIterator(); iter.hasNext();){
            ArrayList<Animal> tmp = iter.next();
            System.out.println(tmp.size());
        }
    }

}