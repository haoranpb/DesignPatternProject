package Item.BuildingValue.Strategy.ExquisiteBuilding;

import Item.BuildingValue.BuildingForPeople;
import Item.BuildingValue.Strategy.BuildStrategy;
import Item.BuildingValue.Strategy.ExquisiteBuilding.ExquisiteBuilding;
import Item.BuildingValue.BuildingType;

/**
 * Strategy & Prototype
 * @author HXP/XYN
 * @version 2018-10-29 03:00
 */
public class ExquisiteBuildStrat implements BuildStrategy {
    @Override
    public BuildingForPeople building() {
        BuildingForPeople f = ExquisiteBuilding.findAndClone(BuildingType.EXQU);
        return f;
    }

    @Override
    public String toString() {
        return "Exquisite food is built.";
    }
}
