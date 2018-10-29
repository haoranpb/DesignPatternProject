package Person;

import Base.Animal;

import static Action.BreedAction.PigList;

public class Interpreter {
    public Interpreter(){}

    public static void inpterpret(String expression, Animal animal){
        if(expression.equals("add")){
            PigList.add(animal);
        }
    }
}
