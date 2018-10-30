package Item.BuildingValue.Strategy;

import Item.BuildingValue.BuildingForPeople;

/**
 * Cook strategy(Strategy & Prototype)
 * @author YGH
 * @version 2017-10-29 02:00
 */
public interface BuildStrategy {
    /**
     * Virtual method (for polymorphism).
     * @return foodForPerson
     *
     */
    public abstract BuildingForPeople building();
}
