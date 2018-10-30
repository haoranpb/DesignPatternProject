package Item.BuildingValue.Strategy;

import Item.BuildingValue.BuildingForPeople;

/**
 * Cook strategy(Strategy & Prototype)
 * @author XYN/HXP
 * @version 2018-10-29 02:00
 */
public interface BuildStrategy {
    /**
     * Virtual method (for polymorphism).
     * @return BuildingForPeople
     *
     */
    public abstract BuildingForPeople building();
}
