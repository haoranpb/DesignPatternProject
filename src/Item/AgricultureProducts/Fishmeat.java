package src.Item.AgricultureProducts;

import src.Base.Item;

/**
 * Customer-defined agriculture product: Fishmeat (Iterator Method)
 * @author XYN
 * @version 2018-10-29 09:33
 */
public class Fishmeat extends Item {
    private int amount;

    /**
     * Constructor. Initialize product value while constructing.
     * @param amount
     * Fishmeat amount
     */
    public Fishmeat(int amount) {
        amount += 1;
        this.setAmount(amount);
    }

    /**
     * Amount Setter
     * @param amount
     * Fishmeat amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Fishmeat X" + amount;
    }
}