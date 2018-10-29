package Product;

import Product.productAbstractFactory;

public class chickenFactory extends productAbstractFactory {

	@Override
	public void externalPro() {
		System.out.println("add eggs");
		//Eggs.amount = Eggs.amount+1;
		// add eggs
	}

	@Override
	public void internalPro() {
		System.out.println("add chicken");
		//Chickenmeat.amount = Chickenmeat.amount+1;
		// add chicken
	}

}