package Action;

import Base.Animal;
import Base.AnimalAction;
import Base.Memento;

public class BreedAction implements AnimalAction {
	public BreedAction() {};
	Animal target;
	@Override
	public void getself(Animal getanimal) {
		// TODO Auto-generated method stub
		this.target = getanimal;
	}
	
	@Override
	public void runaction() {
		Animal newanimal = new Animal();
		newanimal.Animalname = target.Animalname;
		newanimal.exercise = target.exercise;
		newanimal.sleep = target.sleep;
		newanimal.mem=new Memento("alive");
		newanimal.breed = target.breed;
		newanimal.state=target.state;
		newanimal.product = target.product;
		newanimal.shower = target.shower;
		//TODO:ADD NEWANIMAL INTO LIST
		System.out.println("A new "+newanimal.Animalname+" is born!");
	}

}
