package Item.BuildingValue.Strategy.LuxuryBuilding;



import Item.BuildingValue.Strategy.BuildStrategy;
import Item.BuildingValue.BuildingForPeople;
import Item.BuildingValue.BuildingType;

/**
 * Strategy & Prototype
 * @author XYN/HXP
 * @version 2018-10-29 02:00
 */
public class LuxuryBuildStrat implements BuildStrategy {
    @Override
    public BuildingForPeople building() {
        BuildingForPeople f = LuxuryBuilding.findAndClone(BuildingType.LUXU);
        return f;
    }
    @Override
    public String toString() {
        return "Luxury building is built.";
    }
}
