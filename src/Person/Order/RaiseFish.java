package Person.Order;
import Animal.*;
import Base.Animal;
import Item.Building.AnimalFolds;
import Person.Interpreter;


public class RaiseFish implements Order {
    public void execute(){
        Animal fish = new Fish();
        AnimalFolds.fishList.add(fish);
        System.out.println("Employee Successfully Raised A Fish!");
    }
}
