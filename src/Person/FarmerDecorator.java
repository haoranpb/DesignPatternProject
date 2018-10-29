package Person;
import Base.Animal;
import Animal.*;
import static Action.BreedAction.*;

public class FarmerDecorator extends People {
    public FarmerDecorator(People people){ }

    @Override
    public void raisePig(){
        Animal pig = new Pig();
        PigList.add(pig);
        System.out.println("Farmer Successfully Raised A Pig!");
    }

    @Override
    public void raiseFish(){
        Animal fish = new Fish();
        FishList.add(fish);
        System.out.println("Farmer Successfully Raised A Fish!");
    }

    @Override
    public void raiseSheep(){
        Animal sheep = new Sheep();
        SheepList.add(sheep);
        System.out.println("Farmer Successfully Raised A Sheep!");
    }

    @Override
    public void raiseChicken() {
        Animal chicken = new Chicken();
        ChickenList.add(chicken);
        System.out.println("Farmer Successfully Raised A Chicken!");
    }
}
