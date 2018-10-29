package Action.ExerciseAction;

import Base.Animal;
import Base.AnimalAction;

public interface ExerciseAction extends AnimalAction {
	Animal target;
	public void getself(Animal getanimal) {
		target = getanimal;
	}
	public abstract void runaction(); 
	
	
}
