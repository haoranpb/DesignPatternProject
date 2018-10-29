package Product;

import Item.AgricultureProducts.Fishmeat;
import Item.AgricultureProducts.Pork;
import Product.productAbstractFactory;

public class pigFactory extends productAbstractFactory {
	@Override
	public void externalPro() {
		System.out.println("Pigs have no external product.");
	}
	@Override
	public void internalPro() {
		Pork.amount = Pork.amount+1;
		Pork c = new Pork();
		System.out.println("add pork");
		// add pork
	}
}
