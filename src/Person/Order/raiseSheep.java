package Person.Order;
import Animal.*;
import Base.Animal;
import Person.Interpreter;

public class raiseSheep implements Order{
    public void execute() {
        Animal sheep = new Sheep();
        Interpreter.inpterpret("add", sheep);
        System.out.println("Employee Successfully Raised A Sheep!");
    }
}
