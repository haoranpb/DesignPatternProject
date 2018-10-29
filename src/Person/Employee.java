package Person;
import Animal.*;
import Base.Animal;
import Person.Order.Broker;
import Person.Order.raiseChicken;
import Person.Order.raiseFish;
import Person.Order.raisePig;

import static Action.BreedAction.*;


// Flyweight
public class Employee extends People{
    private static Employee instance = new Employee();

    public static Employee getEmployee(){
        System.out.println("You have successfully employ someone!");
        return instance;
    }

    private Employee(){ }

    public void Harvest(){ // Animal or Plants

    }

    public void Plant(){
        // new some staff
    }

    public void Fertilize(){
        // fertile plants
    }

    @Override
    public void raisePig(){
        Animal pig = new Pig();
        Interpreter.inpterpret("add", pig);
        System.out.println("Employee Successfully Raised A Pig!");
    }

    @Override
    public void raiseFish(){
        Animal fish = new Fish();
        Interpreter.inpterpret("add", fish);
        System.out.println("Employee Successfully Raised A Fish!");
    }

    @Override
    public void raiseSheep(){
        Animal sheep = new Sheep();
        Interpreter.inpterpret("add", sheep);
        System.out.println("Employee Successfully Raised A Sheep!");
    }

    @Override
    public void raiseChicken(){
        Animal chicken = new Chicken();
        Interpreter.inpterpret("add", chicken);
        System.out.println("Employee Successfully Raised A Chicken!");
    }

    public void produceAnimal(String method){
        if(method.equals("death")){
            for(Animal animal: PigList){
                animal.producewithdeath();
            }
            for(Animal animal: FishList){
                animal.producewithdeath();
            }
            for(Animal animal: SheepList){
                animal.producewithdeath();
            }
            for(Animal animal: ChickenList){
                animal.producewithdeath();
            }
            Petdog.bark(); // notify to update
        }
        else{
            for(Animal animal: ChickenList){
                animal.producewithoutdeath();
            }
        }
    }

    public void raiseEveryAnimal(){
        Broker broker = new Broker();

        broker.addOrder(new raisePig());
        broker.addOrder(new raiseFish());
        broker.addOrder(new raiseFish());
        broker.addOrder(new raiseChicken());

        broker.launchOrders();
    }

    public void getAnimalNumber(){
        System.out.println("The Pig Number is " + PigList.size());
        System.out.println("The Fish Number is " + FishList.size());
        System.out.println("The Chicken Number is " + ChickenList.size());
        System.out.println("The Sheep Number is " + SheepList.size());
    }
}
