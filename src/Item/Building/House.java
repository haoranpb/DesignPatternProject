package Item.Building;

/**
 * Composite&Template (Composite Pattern/Template Method)
 * @author XYN/HXP
 * @version 2018-10-29 23:20
 */
public class House{
    private String name;

    /**
     * Constructor
     * @param name
     * Item name.
     */
    public House(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
