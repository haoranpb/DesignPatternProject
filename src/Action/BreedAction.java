package Action;

import Base.Animal;
import Base.AnimalAction;
import Base.Memento;

import java.util.Vector;

public class BreedAction implements AnimalAction {
	public static Vector<Animal> PigList = new Vector<Animal>();
    public static Vector<Animal> SheepList = new Vector<Animal>();
    public static Vector<Animal> ChickenList = new Vector<Animal>();
    public static Vector<Animal> FishList = new Vector<Animal>();
	public Animal[] worklist;
	public BreedAction() {}
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
			PigList.add(newanimal);
			 System.out.println("A new "+newanimal.Animalname+" is born!");
			break;
		case "Fish":
			FishList.add(newanimal);
			System.out.println("A new "+newanimal.Animalname+" is born!");
			break;
		case "Sheep":
			SheepList.add(newanimal);
			System.out.println("A new "+newanimal.Animalname+" is born!");
			break;
		case "Chicken":
			ChickenList.add(newanimal);
			System.out.println("A new "+newanimal.Animalname+" is born!");
			break;
		}
	}

}
