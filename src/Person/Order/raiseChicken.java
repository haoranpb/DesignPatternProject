package Person.Order;
import Animal.*;
import Base.Animal;
import Person.Interpreter;

public class raiseChicken implements Order{
    public void execute() {
        Animal chicken = new Chicken();
        Interpreter.inpterpret("add", chicken);
        System.out.println("Employee Successfully Raised A Chicken!");
    }
}
