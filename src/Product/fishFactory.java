package Product;

import Product.productAbstractFactory;

public class fishFactory extends productAbstractFactory {
	
	@Override
	public void externalPro() {
		System.out.println("Fish have no external product.");
	}

	@Override
	public void internalPro() {
		// TODO add fish
		//Fishmeat.amount = Fishmeat.amount+1;
		System.out.println("add fish");
	}
}
