package src.Item.AgricultureProducts;

import src.Base.Item;

/**
 * Customer-defined agriculture product: Wool (Factory Method)
 * @author XYN
 * @version 2018-10-29 09:33
 */
public class Pork extends Item {
    private int amount;

    /**
     * Constructor. Initialize product value while constructing.
     * @param amount
     * Eggs amount
     */
    public Pork(int amount) {
        amount += 1;
        this.setAmount(amount);
    }

    /**
     * Amount Setter
     * @param amount
     * Eggs amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Pork X" + amount;
    }
}