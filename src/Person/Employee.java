package Person;
import Animal.*;
import Base.Animal;
import Item.Building.AnimalFolds;
import Person.Order.*;



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
        AnimalFolds.pigList.add(pig);
        System.out.println("Employee Successfully Raised A Pig!");
    }

    @Override
    public void raiseFish(){
        Animal fish = new Fish();
        AnimalFolds.fishList.add(fish);
        System.out.println("Employee Successfully Raised A Fish!");
    }

    @Override
    public void raiseSheep(){
        Animal sheep = new Sheep();
        AnimalFolds.sheepList.add(sheep);
        System.out.println("Employee Successfully Raised A Sheep!");
    }

    @Override
    public void raiseChicken(){
        Animal chicken = new Chicken();
        AnimalFolds.chickenList.add(chicken);
        System.out.println("Employee Successfully Raised A Chicken!");
    }

    public void produceAnimal(String method){
        if(method.equals("death")){
            for(Animal animal: AnimalFolds.pigList){
                animal.producewithdeath();
            }
            for(Animal animal: AnimalFolds.fishList){
                animal.producewithdeath();
            }
            for(Animal animal: AnimalFolds.sheepList){
                animal.producewithdeath();
            }
            for(Animal animal: AnimalFolds.chickenList){
                animal.producewithdeath();
            }
            Petdog.bark(); // notify to update
        }
        else{
            for(Animal animal: AnimalFolds.chickenList){
                animal.producewithoutdeath();
            }
        }
    }

    public void raiseEveryAnimal(){
        Broker broker = new Broker();

        broker.addOrder(new RaisePig());
        broker.addOrder(new RaiseFish());
        broker.addOrder(new RaiseSheep());
        broker.addOrder(new RaiseChicken());

        broker.launchOrders();
    }

    public void getAnimalNumber(){
        System.out.println("The Pig Number is " + AnimalFolds.pigList.size());
        System.out.println("The Fish Number is " + AnimalFolds.fishList.size());
        System.out.println("The Chicken Number is " + AnimalFolds.chickenList.size());
        System.out.println("The Sheep Number is " + AnimalFolds.sheepList.size());
    }
}
