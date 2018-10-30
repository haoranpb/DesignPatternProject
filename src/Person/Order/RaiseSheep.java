package Person.Order;
import Animal.*;
import Base.Animal;
import Item.Building.AnimalFolds;
import Person.Interpreter;

public class RaiseSheep implements Order{
    public void execute() {
        Animal sheep = new Sheep();
        AnimalFolds.sheepList.add(sheep);
        System.out.println("Employee Successfully Raised A Sheep!");
    }
}
