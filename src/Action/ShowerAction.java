package Action;


import Base.Animal;
import Base.AnimalAction;

public abstract class ShowerAction implements AnimalAction {
	Animal self;
	private ShowerAction nextHandler;
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
	

	
}