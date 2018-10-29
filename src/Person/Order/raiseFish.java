package Person.Order;
import Animal.*;
import Base.Animal;
import Person.Interpreter;


public class raiseFish implements Order {
    public void execute(){
        Animal fish = new Fish();
        Interpreter.inpterpret("add", fish);
        System.out.println("Employee Successfully Raised A Fish!");
    }
}
