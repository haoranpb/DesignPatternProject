package Action;
import Action.*;
import Base.*;

public class OverallShowerAction implements AnimalAction{
	Animal self;
	@Override
	public void getself(Animal getanimal) {
		// TODO Auto-generated method stub
		self = getanimal;
	}

	@Override
	public void runaction() {
		//this.shower(self.shower);
	}
	
	
	private ShowerAction c1shower;
	private ShowerAction c2shower;
	private ShowerAction c3shower;
	private ShowerAction currentshower;
	
	public OverallShowerAction() {
		c1shower.self = self;
		c2shower.self = self;
		c3shower.self = self;
		c1shower.mode = 1;//do shower in the sand
		c2shower.mode = 2;//do shower in the water
		c3shower.mode = 3;//no shower 
		c1shower.setNext(c2shower);
		c2shower.setNext(c3shower);
		c3shower.setNext(c3shower);
		
	}
	public void takeshower() {
		currentshower = c1shower;
		while (true)
		{
			if (self.showerclass == currentshower.mode)
				currentshower.doshower();
			else 
				currentshower.setNext(currentshower);
		}
	}
	
}
