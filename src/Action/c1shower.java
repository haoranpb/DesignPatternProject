package Action;
import Action.*;
import Base.Animal;
public class c1shower extends ShowerAction{
	
	Animal self;
	public c2shower c2 = new c2shower();
	
	public c1shower() {
		mode = 1;
		nextHandler = c2;
	}
}
