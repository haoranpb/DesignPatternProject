package Product;

import Product.productAbstractFactory;

public class pigFactory extends productAbstractFactory {
	@Override
	public void externalPro() {
		System.out.println("Pigs have no external product.");
	}
	@Override
	public void internalPro() {
		//Porkmeat.amount = Porkmeat.amount+1;
		System.out.println("add pork");
		// add pork
	}
}
