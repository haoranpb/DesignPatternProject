package Product;

import Item.AgricultureProducts.Mutton;
import Item.AgricultureProducts.Pork;
import Product.productAbstractFactory;

public class sheepFactory extends productAbstractFactory {

	@Override
	public void externalPro() {
		System.out.println("Sheep have no external product.");
		// add wool
	}
	
	@Override
	public void internalPro() {
		Mutton.amount = Mutton.amount+1;
		Mutton c = new Mutton();
		System.out.println("add mutton");
		// add mutton
	}

}