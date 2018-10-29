package Product;

import Product.productAbstractFactory;

public class pigFactory extends productAbstractFactory {
	

	@Override
	public void externalPro() {
		// TODO Auto-generated method stub
		System.out.println("Pigs have no external product.");
	}

	@Override
	public void internalPro() {
		// TODO Auto-generated method stub
		System.out.println("add pork");
		// add pork
	}
}
