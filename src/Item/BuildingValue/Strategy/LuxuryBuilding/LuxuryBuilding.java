package Item.BuildingValue.Strategy.LuxuryBuilding;

import Item.BuildingValue.BuildingForPeople;
import Item.BuildingValue.BuildingType;


/**
 * Prototype
 * @author HXP/XYN
 * @version 2018-10-29 02:20
 */
public class LuxuryBuilding extends BuildingForPeople {
    private static int refs = 1;
    private int id;
    private static LuxuryBuilding lf;
    private LuxuryBuilding() {
        addPrototype(this);
    }
    protected LuxuryBuilding(int d) {
        id = refs++;
    }
    @Override
    protected BuildingType returnType() {
        return BuildingType.LUXU;
    }

    @Override
    protected BuildingForPeople clone() {
        return new LuxuryBuilding(1);
    }
    @Override
    public String toString() {
        return "Here is a luxury food.";
    }
}
