package Action;


import Base.Animal;
import Base.AnimalAction;
import Action.*;

public class ShowerAction implements AnimalAction {
	Animal self;
	public ShowerAction nextHandler;
	public int mode = 0;
	
	
	public ShowerAction(int a) {
		nextHandler = new c1shower();

	}
	@Override
	public void getself(Animal getanimal) {
		// TODO Auto-generated method stub
		self = getanimal;
		if(nextHandler!=null) {
			nextHandler.self = getanimal;
		}
	}
	public ShowerAction() {
	}
	@Override
	public void runaction() {
		if(nextHandler!=null) {
			nextHandler.self = self;
		}
		
		if(mode == self.showerclass)
		{
			System.out.println("succ");
			if (mode == 1)
				System.out.println(self.Animalname + " do shower in sand.");
			//TODO: do shower
			else if (mode == 2)
				System.out.println(self.Animalname + " do shower in water.");
			else
				System.out.println(self.Animalname + " don't do shower");
		}
		else 
			nextHandler.runaction();
	}
	

}