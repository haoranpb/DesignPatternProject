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
		breed=new BreedAction();
		breed.getself(this);
		sleep = new c1sleep();
		sleep.getself(this);
		shower = new ShowerAction(1);
		shower.getself(this);
		showerclass = 2;
		mem = new Memento("alive");
		product = new pigFactory();
	}
	
	

}
