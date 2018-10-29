package Action;

import Base.Animal;
import Base.AnimalAction;

public abstract class SleepAction implements AnimalAction {
	Animal self;
	@Override
	public void getself(Animal getanimal) {
		// TODO Auto-generated method stub
		self = getanimal;
	}

	@Override
	public void runaction() {
		// TODO Auto-generated method stub
		sleepstep1();
		sleepstep2();
	}
	public abstract void sleepstep1();
	public void sleepstep2() {System.out.println("Animal "+this.self.Animalname+" sleep");}

}
