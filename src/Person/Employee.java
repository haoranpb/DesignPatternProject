package Person;
import Animal.*;
import Base.Animal;

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
        // for plant in PlantList: plant.harvest() --- adaptor
        // seeds ++(or seeds already ++ in harvest function)

        // for animal in AnimalList: Animal.produceWith/WithoutDeath()
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
        FishList.add(fish);
        System.out.println("Employee Successfully Raised A Fish!");
    }

    @Override
    public void raiseSheep(){
        Animal sheep = new Sheep();
        SheepList.add(sheep);
        System.out.println("Employee Successfully Raised A Sheep!");
    }

    @Override
    public void raiseChicken(){
        Animal chicken = new Chicken();
        ChickenList.add(chicken);
        System.out.println("Employee Successfully Raised A Chicken!");
    }

    public void getAnimalNumber(){
        System.out.println("The Pig Number is " + PigList.size());
        System.out.println("The Fish Number is " + FishList.size());
        System.out.println("The Chicken Number is " + ChickenList.size());
        System.out.println("The Sheep Number is " + SheepList.size());
    }
}
