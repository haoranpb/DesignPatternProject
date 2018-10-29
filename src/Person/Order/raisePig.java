package Person.Order;
import Animal.*;
import Base.Animal;
import Person.Interpreter;

public class raisePig implements Order {
    public void execute(){
        Animal pig = new Pig();
        Interpreter.inpterpret("add", pig);
        System.out.println("Employee Successfully Raised A Pig!");
    }
}
