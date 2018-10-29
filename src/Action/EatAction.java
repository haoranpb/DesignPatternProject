package Action;

import Base.Animal;
import Base.AnimalAction;

public class EatAction implements AnimalAction {
	public EatAction() {};
	Animal target;
	@Override
	public void getself(Animal getanimal) {
		// TODO Auto-generated method stub
		this.target = getanimal;
	}

	@Override
	public void runaction() {
		// TODO Auto-generated method stub
		
	}
	
	
}
