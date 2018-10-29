package Animal;
import Action.*;
import Action.ExerciseAction.RunAction;
import Base.*;
import Product.sheepFactory;

public  class Sheep extends Animal {

	public Sheep() {
		this.Animalname = "Sheep";
		exercise= new RunAction();
		exercise.getself(this);

		breed.getself(this);
		sleep = new c1sleep();
		sleep.getself(this);
		mem = new Memento("alive");
		product = new sheepFactory();
	}


}
