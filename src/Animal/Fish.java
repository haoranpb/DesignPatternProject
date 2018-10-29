package Animal;
import Action.*;
import Action.ExerciseAction.SwimAction;
import Base.*;
import Product.fishFactory;

public class Fish extends Animal {


	public Fish() {
		this.Animalname = "Fish";
		exercise= new SwimAction();
		exercise.getself(this);
		breed=new BreedAction();
		breed.getself(this);
		sleep = new c2sleep();
		sleep.getself(this);
		mem = new Memento("alive");
		product = new fishFactory();
	}



}
