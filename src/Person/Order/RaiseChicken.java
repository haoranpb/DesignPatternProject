package Person.Order;
import Animal.*;
import Base.Animal;
import Item.Building.AnimalFolds;
import Person.Interpreter;

public class RaiseChicken implements Order{
    public void execute() {
        Animal chicken = new Chicken();
        AnimalFolds.chickenList.add(chicken);
        System.out.println("Employee Successfully Raised A Chicken!");
    }
}
