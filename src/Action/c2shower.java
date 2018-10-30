package Action;
import Action.*;
import Base.Animal;
public class c2shower extends ShowerAction{
	
	Animal self;
	
	public c2shower() {
		mode = 2;
		nextHandler = new c3shower();
		if(nextHandler!=null) {
			nextHandler.self = self;
		}
	}
}
