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
		shower = new ShowerAction(1);
		shower.getself(this);
		showerclass = 1;
		mem = new Memento("alive");
		product = new chickenFactory();
	}
	
	
	

}
