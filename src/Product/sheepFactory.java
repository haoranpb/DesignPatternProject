package Product;

import Product.productAbstractFactory;

public class sheepFactory extends productAbstractFactory {

	@Override
	public void externalPro() {
		System.out.println("add wool");
		// add wool
	}
	
	@Override
	public void internalPro() {
		System.out.println("add mutton");
		// add mutton
	}

}