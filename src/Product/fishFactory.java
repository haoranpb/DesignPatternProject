package Product;

import Product.productAbstractFactory;

public class fishFactory extends productAbstractFactory {
	
	@Override
	public void externalPro() {
		// TODO Auto-generated method stub
		System.out.println("Fish have no external product.");
	}

	@Override
	public void internalPro() {
		// TODO add fish
		System.out.println("add fish");
	}
}
