package Base;

import Action.*;
import Action.ExerciseAction.ExerciseAction;


public class Animal {
	public String state = "alive";
	public SleepAction sleep;
	public String Animalname;
	public ExerciseAction exercise;
	public BreedAction breed;
	public EatAction eat;
	public Memento mem;
	public void exe() {	exercise.runaction();}
	public void eat() {eat.runaction();};
	public void breed() {breed.runaction();};
	//TODO:产生农产品
	public void sleep() {
		sleep.runaction();
	}
	public void setstate() {this.state = mem.getstate();}
	public void getstate() {System.out.println("state is "+this.state);}
	public void setmem() { mem.setstate(this.state);}
}

