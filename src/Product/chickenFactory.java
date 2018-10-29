package Product;

import Product.productAbstractFactory;

public class chickenFactory extends productAbstractFactory {

	@Override
	public void externalPro() {
		System.out.println("add eggs");
		// add eggs
	}

	@Override
	public void internalPro() {
		System.out.println("add chicken");
		// add chicken
	}

}