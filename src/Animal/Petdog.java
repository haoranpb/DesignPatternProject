package Animal;
import Action.*;
import Action.ExerciseAction.RunAction;
import Base.*;

public class Petdog extends c2sleep implements petdogsleep {

	public Petdog() {
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.sleepstep1();
		System.out.println("Pet dog is sleeping!");
	}

}
