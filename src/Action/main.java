package Action;
import Animal.*;
import Base.Animal;
import Base.AnimalAction;

public class main{
	 public static void main(String args[]) {
		Animal f= new Chicken();
		f.exe();
		
		Animal.Petdog.sleep();
		
		f.breed();
		f.setmem();
		f.setstate();
		f.getstate();
		f.sleep();
		f.producewithdeath();
		f.producewithoutdeath();
	 }
}
