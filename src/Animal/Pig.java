package Animal;


import Action.*;
import Action.ExerciseAction.RunAction;
import Base.*;

public class Pig extends Animal {


	public Pig() {
		this.Animalname = "Pig";
		exercise= new RunAction();
		exercise.getself(this);
		breed=new BreedAction();
		breed.getself(this);
		sleep = new c1sleep();
		sleep.getself(this);
		mem = new Memento("alive");
	}
	
	

}
