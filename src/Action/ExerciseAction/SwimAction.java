package Action.ExerciseAction;

import Base.Animal;

public class SwimAction implements ExerciseAction {
	
	public Animal target;
	public void getself(Animal getanimal) {
		target = getanimal;
	}
	

	
	@Override
	public void runaction() {
		// TODO Auto-generated method stub
		String animalname = this.target.Animalname;
		System.out.println(animalname+" is swimming!");
	}

}