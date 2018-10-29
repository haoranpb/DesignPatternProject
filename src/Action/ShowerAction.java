package Action;


import Base.Animal;
import Base.AnimalAction;

public class ShowerAction implements AnimalAction {
	Animal self;
	private ShowerAction nextHandler;
	public int mode;
	@Override
	public void getself(Animal getanimal) {
		// TODO Auto-generated method stub
		self = getanimal;
	}

	@Override
	public void runaction() {
		//this.shower(self.shower);
	}
	
	public void setNext(ShowerAction handler){
        this.nextHandler = handler;
    }
	public void doshower() {
		if (mode == 1)
			System.out.println(self.Animalname + " do shower in sand");
		else if (mode == 2)
			System.out.println(self.Animalname + " do shower in water");
		else
			System.out.println(self.Animalname + " don't need to do shower");
	}
		
}