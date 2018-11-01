package Person;
import Base.Animal;

public class Interpreter {
    public Interpreter(){}

    public static void inpterpret(String expression, Animal animal){
        if(expression.equals("add")){
            System.out.println("\n\n------------Interpreter test in Person------------");
            System.out.println("Now we add animal to animal list through interpreter");
            Item.Building.AnimalFolds.pigList.add(animal);
        }
    }
}
