package Animal;
import Base.*;
import Product.chickenFactory;
import Action.*;
import Action.ExerciseAction.*;

public class Chicken extends Animal{
	public Chicken() {
		this.Animalname = "Chicken";
		
		exercise= new FlyAction();
		exercise.getself(this);
		breed=new BreedAction();
		breed.getself(this);
		sleep = new c1sleep();
		sleep.getself(this);
		mem = new Memento("alive");
		product = new chickenFactory();
		//TODO:在静态list当中加上this
	}
	
	
	

}
