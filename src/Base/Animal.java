package Base;
import Animal.Petdog;
import Action.*;
import Action.ExerciseAction.*;
import Product.*;

public class Animal {
	public static Petdog Petdog = new Petdog();
	public String state = "alive";
	public SleepAction sleep;
	public String Animalname;
	public void shower() {shower.runaction();}
	public ExerciseAction exercise;
	public BreedAction breed = new BreedAction();
	public Memento mem;
	public ShowerAction shower;
	public int showerclass;
	public productAbstractFactory product;
	public void exe() {	exercise.runaction(); }
	public void breed() {breed.runaction();};
	public void producewithdeath() {product.internalPro(); this.state = "dead";};
	public void producewithoutdeath() {product.externalPro();};
	public void sleep() {sleep.runaction();}
	public void setstate() {this.state = mem.getstate();}
	public void getstate() {System.out.println("state is "+this.state);}
	public void setmem() { mem.setstate(this.state);}
	public void fightWithDog() {
		Petdog.fight();
	}
	public void exewithset(String exer) {
		ExerciseAction e = null;
		if(exer == "Run") {
			System.out.println("run");
			e = new RunAction();
		}
		else if(exer == "Swim") {
			e  = new SwimAction();
		}
		else if(exer == "Fly") {
			e  = new FlyAction();
		}
		else {
			return;
		}
		e.getself(this);
		e.runaction();
	}
}

