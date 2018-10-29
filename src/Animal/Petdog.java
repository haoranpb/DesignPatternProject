package Animal;
import Action.*;
import Action.ExerciseAction.RunAction;

public class Petdog extends c2sleep implements petdogsleep {

	public Petdog() {
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleepstep1();
		System.out.println("Pet dog is sleeping!");
	}

	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Pet dog won the fight!");
	}

}
