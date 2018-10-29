package Person;
import Animal.*;
import Base.Animal;
import static Action.BreedAction.*;

public class People {

    public void getAnimalNumber(){
        System.out.println("The Pig Number is " + PigList.size());
        System.out.println("The Fish Number is " + FishList.size());
        System.out.println("The Chicken Number is " + ChickenList.size());
        System.out.println("The Sheep Number is " + SheepList.size());
    }

    public void raisePig(){}
    public void raiseFish(){}
    public void raiseSheep(){}
    public void raiseChicken(){}
}
