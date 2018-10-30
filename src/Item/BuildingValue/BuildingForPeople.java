package Item.BuildingValue;

/**
 * Abstraction of food for person (Prototype)
 * @author XYN/HXP
 * @version 2018-10-29 14:10
 */

public abstract class BuildingForPeople{

    private static final int MAX_FOODTYPE_AMOUNT = 10;
    private static int count = 0;
    private static BuildingForPeople[] prototypes = new BuildingForPeople[MAX_FOODTYPE_AMOUNT];

    /**
     * Get food type of current instance; virtual method.
     * @return foodType
     */
    protected abstract BuildingType returnType();

    /**
     * Get new food instance by clone; virtual method.
     * @return foodForPerson
     */
    protected abstract BuildingForPeople clone();

    /**
     * Add new food prototype to prototype array.
     * @param f
     * New prototype of food.
     */
    protected static void addPrototype(BuildingForPeople f) {
        prototypes[count++] = f;
    }

    /**
     * Find if param' ft is a new type of food. If not, get a clone.
     * @param ft
     * A food type.
     * @return foodForPerson
     */
    public static BuildingForPeople findAndClone(BuildingType ft){
        for (int i = 0; i < count; ++i) {
            if (prototypes[i].returnType() == ft) return prototypes[i].clone();
        }
        return null;
    }
}
