package Item.BuildingValue.Strategy.SimpleBuilding;

import Item.BuildingValue.BuildingForPeople;
import Item.BuildingValue.BuildingType;


/**
 * Prototype
 * @author HXP/XYN
 * @version 2018-10-29 14:20
 */
public class SimpleBuilding extends BuildingForPeople {
    private static int refs = 1;
    private int id;
    private static SimpleBuilding sf;
    private SimpleBuilding() {
        addPrototype(this);
    }
    protected SimpleBuilding(int d) {
        id = refs++;
    }

    @Override
    protected BuildingType returnType() {
        return BuildingType.SIMP;
    }

    @Override
    protected BuildingForPeople clone() {
        return new SimpleBuilding(1);
    }

    @Override
    public String toString() {
        return "Here is a simple building.";
    }
}
