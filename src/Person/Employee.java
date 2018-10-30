package Person;
import Animal.*;
import Base.Animal;
import Item.Building.*;
import Person.Order.*;
import Plant.AbstractFactory.PlantFactory;
import Plant.*;
import Plant.Strategy.*;

import java.util.ArrayList;


// Flyweight
public class Employee extends People{
    private static Employee instance = new Employee();

    public static Employee getEmployee(){
        System.out.println("You have successfully employ someone!");
        return instance;
    }

    private Employee(){ }

    public void harvest(){ // Animal or Plants
        System.out.println("Harvest all plants");
        for(Corn item : PlantField.cornList){
            item.harvested();
        }
        for(Rice item : PlantField.riceList){
            item.harvested();
        }
        for(Pasture item : PlantField.pastureList){
            item.harvested();
        }
    }

    public void plant(){
        PlantFactory pf = new PlantFactory();
        System.out.println("We are planting 5 plant each");
        for(int number = 0; number < 5; number++) {
            Corn newCorn = pf.getCorn();
            if(newCorn == null) break;

            PlantField.cornList.add(newCorn);
        }
        for(int number = 0;number < 5; number++) {
            Rice newRice = pf.getRice();
            if(newRice == null) break;

            PlantField.riceList.add(newRice);
        }
        for(int number = 0;number < 5;number++) {
            Pasture newPasture = pf.getPasture();
            if(newPasture == null) break;

            PlantField.pastureList.add(newPasture);
        }
    }

    public void fertilize(){
        System.out.println("Fertilize All Plants");
        for (Corn item : PlantField.cornList) {
            item.fertilized();
        }
        for (Rice item : PlantField.riceList) {
            item.fertilized();
        }
        for (Pasture item : PlantField.pastureList) {
            item.fertilized();
        }
    }

    public void fertilizePasture(){
        System.out.println("Pastures needs to be fertilized twice");
        for (Pasture item : PlantField.pastureList) {
            item.fertilized();
        }
    }

    public void pollination(){
        System.out.println("We are going to pollinate all plants");
        for(Corn item : PlantField.cornList){ // corn and rise need to be poll
            PollinationStrategy ps = new SpontaneousPollination();
            ps.pollinate(item);
        }
        for(Rice item : PlantField.riceList){ // corn and rise need to be poll
            PollinationStrategy ps = new SpontaneousPollination();
            ps.pollinate(item);
        }
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
        System.out.println("The Chicken, Fish, Sheep, Pig Number is:");

        AnimalList animalList = new AnimalList();
        for(AnimalList.Interator iter = animalList.getIterator(); iter.hasNext();){
            ArrayList<Animal> tmp = iter.next();
            System.out.println(tmp.size());
        }
    }
}
