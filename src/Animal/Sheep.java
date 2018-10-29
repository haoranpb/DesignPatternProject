package Animal;
import Action.*;
import Action.ExerciseAction.RunAction;
import Base.*;

public  class Sheep extends Animal {

	public Sheep() {
		this.Animalname = "Sheep";
		exercise= new RunAction();
		exercise.getself(this);
		breed=new BreedAction();
		breed.getself(this);
		sleep = new c1sleep();
		sleep.getself(this);
		mem = new Memento("alive");
	}


}
