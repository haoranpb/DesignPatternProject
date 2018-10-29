package Animal;


import Action.*;
import Action.ExerciseAction.RunAction;
import Base.*;
import Product.pigFactory;

public class Pig extends Animal {


	public Pig() {
		this.Animalname = "Pig";
		exercise= new RunAction();
		exercise.getself(this);

		breed.getself(this);
		sleep = new c1sleep();
		sleep.getself(this);
		mem = new Memento("alive");
		product = new pigFactory();
	}
	
	

}
