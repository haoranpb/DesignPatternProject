package Item.Building;

/**
 * Template(Template Method)
 * @author XYN/HXP
 * @version 2018-10-29 23:10
 */

public class HouseConstruction extends BuildingConstruction{
    @Override
    public void  ConstructionBuilding(){
        //建造House主体建筑的具体方法
    }
    @Override
    public void  ExteriorTrim(){
        //修葺House外部环境的具体方法
    }
}
