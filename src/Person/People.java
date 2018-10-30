package Person;

import Item.Building.AnimalFolds;

public class People {

    public void getAnimalNumber(){
        System.out.println("The Pig Number is " + AnimalFolds.pigList.size());
        System.out.println("The Fish Number is " + AnimalFolds.fishList.size());
        System.out.println("The Chicken Number is " + AnimalFolds.chickenList.size());
        System.out.println("The Sheep Number is " + AnimalFolds.sheepList.size());
    }

    public void raisePig(){}
    public void raiseFish(){}
    public void raiseSheep(){}
    public void raiseChicken(){}
}
