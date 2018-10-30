package Item.BuildingValue.Strategy.SimpleBuilding;

import Item.BuildingValue.Strategy.BuildStrategy;
import Item.BuildingValue.BuildingForPeople;
import Item.BuildingValue.BuildingType;

/**
 * Strategy & Prototype
 * @author HXP/XYN
 * @version 2018-10-29 14:00
 */
public class SimpleBuildStrat implements BuildStrategy {
    @Override
    public BuildingForPeople building() {
        BuildingForPeople f = SimpleBuilding.findAndClone(BuildingType.SIMP);
        return f;
    }
    @Override
    public String toString() {
        return "Simple food is cooked.";
    }
}
