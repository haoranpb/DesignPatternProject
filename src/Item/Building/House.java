package Item.Building;

/**
 * Leaf (Composite Pattern)
 * @author YGH
 * @version 2017-10-29 10:10
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

public class HouseConstruction extend BuildingConstruction{
    @Override
    public void  ConstructionBuilding(){
        //建造House主体建筑的具体方法
    }
    @Override
    public void  ExteriorTrim(){
        //修葺House外部环境的具体方法
    }
}
