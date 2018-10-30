package Item.BuildingValue.Strategy.ExquisiteBuilding;

import Item.BuildingValue.BuildingForPeople;
import Item.BuildingValue.BuildingType;

/**
 * Prototype
 * @author HXP/XYN
 * @version 2018-10-29 02:20
 */
public class ExquisiteBuilding extends BuildingForPeople {
    private static int refs = 1;
    private int id;
    private static ExquisiteBuilding eb;

    private ExquisiteBuilding() {
        addPrototype(this);
    }
    protected ExquisiteBuilding(int d) {
        id = refs++;
    }

    protected BuildingType returnType() {
        return BuildingType.EXQU;
    }

    protected BuildingForPeople clone() {
        return new ExquisiteBuilding(1);
    }

    public String toString() {
        return "Here is a exquisite building.";
    }
}
