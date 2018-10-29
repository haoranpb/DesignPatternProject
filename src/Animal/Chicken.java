package Animal;
import Base.*;
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
		//TODO:在静态list当中加上this
	}
	
	
	

}
