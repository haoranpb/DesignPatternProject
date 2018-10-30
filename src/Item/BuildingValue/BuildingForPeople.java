package Item.BuildingValue;

/**
 * Abstraction of food for person (Prototype)
 * @author XYN/HXP
 * @version 2018-10-29 14:10
 */

public abstract class BuildingForPeople{

    private static final int MAX_BUILDINGTYPE_AMOUNT = 10;
    private static int count = 0;
    private static BuildingForPeople[] prototypes = new BuildingForPeople[MAX_BUILDINGTYPE_AMOUNT];

    /**
     * Get building type of current instance; virtual method.
     * @return buildingType
     */
    protected abstract BuildingType returnType();

    /**
     * Get new building instance by clone; virtual method.
     * @return BuildingForPeople
     */
    protected abstract BuildingForPeople clone();

    /**
     * Add new building prototype to prototype array.
     * @param f
     * New prototype of building.
     */
    protected static void addPrototype(BuildingForPeople f) {
        prototypes[count++] = f;
    }

    /**
     * Find if param' ft is a new type of building. If not, get a clone.
     * @param ft
     * A food type.
     * @return buildingForPeople
     */
    public static BuildingForPeople findAndClone(BuildingType ft){
        for (int i = 0; i < count; ++i) {
            if (prototypes[i].returnType() == ft) return prototypes[i].clone();
        }
        return null;
    }
}
