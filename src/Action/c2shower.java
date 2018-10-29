package Action;
import Action.*;
import Base.Animal;
public class c2shower extends ShowerAction{
	
	Animal self;
	public c3shower c3 = new c3shower();
	
	public c2shower() {
		mode = 2;
		nextHandler = c3;
	}
}
