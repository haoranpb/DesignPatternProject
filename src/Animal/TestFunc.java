package Animal;

import Base.Animal;

public class TestFunc {
	 public static void main(String args[]) {
			Animal f= new Chicken();
			f.exe();
			Animal.Petdog.sleep();
			f.breed();
			f.setmem();
			f.setstate();
			f.getstate();
			f.sleep();
			f.producewithoutdeath();
			f.producewithdeath();
			f.shower();
			f.exewithset("Run");
		 }
}
