package Action;

import Base.Animal;
import Base.AnimalAction;
import Base.Memento;

public class BreedAction implements AnimalAction {
	public static Animal[] PigList = new Animal[100];
	public static Animal[] SheepList = new Animal[100];
	public static Animal[] ChickenList = new Animal[100];
	public static Animal[] FishList = new Animal[100];
	public Animal[] worklist;
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
	
		switch(target.Animalname){
		case "Pig":
			//AnimalFold.PigList.Add(newanimal);
			 System.out.println("A new "+newanimal.Animalname+" is born!");
			break;
		case "Fish":
			//AnimalFold.PigList.Add(newanimal);
			System.out.println("A new "+newanimal.Animalname+" is born!");
			break;
		case "Sheep":
			//AnimalFold.PigList.Add(newanimal);
			System.out.println("A new "+newanimal.Animalname+" is born!");
			break;
		case "Chicken":
			//AnimalFold.PigList.Add(newanimal);
			System.out.println("A new "+newanimal.Animalname+" is born!");
			break;
		}
	}

}
