package src.Item.Food.Strategy.ExquisiteFood;

import src.Item.Food.FoodForPerson;
import src.Utility.FoodType;

/**
 * Exquisite food. (Prototype)
 * @author YGH
 * @version 2017-10-29 02:20
 */
public class ExquisiteBuilding extends FoodForPerson {
    private static int refs = 1;
    private int id;
    private static ExquisiteBuilding eb;

    private ExquisiteBuilding() {
        addPrototype(this);
    }
    protected ExquisiteBuilding(int d) {
        id = refs++;
    }
    @Override
    protected FoodType returnType() {
        return FoodType.EXQU;
    }

    @Override
    protected FoodForPerson clone() {
        return new ExquisiteBuilding(1);
    }
    @Override
    public String toString() {
        return "Here is a exquisite building.";
    }
}
