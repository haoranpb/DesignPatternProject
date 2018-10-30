package Action;
import Action.*;
import Base.Animal;
public class c3shower extends ShowerAction{
	
	Animal self;

	
	public c3shower() {	
		mode = 3;
	if(nextHandler!=null) {
		nextHandler.self = self;
	}
	};
}
