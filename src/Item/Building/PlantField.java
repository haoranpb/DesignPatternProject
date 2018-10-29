package Item.Building;

import Plant.Rice;
import Plant.Corn;
import Plant.Pasture;

import java.util.ArrayList;

/**
 * Composite (Composite Pattern)
 * @author YGH
 * @version 2017-10-29 10:10
 */
public class PlantField{

    public static ArrayList<Corn> cornList = new ArrayList();
    public static ArrayList<Rice> riceList = new ArrayList();
    public static ArrayList<Pasture> pastureList = new ArrayList();

    public PlantField(){}
}

public class PlantFieldConstruction extend BuildingConstruction{
    @Override
    public void  ConstructionBuilding(){
        //建造PlantField主体建筑的具体方法
    }
    @Override
    public void  ExteriorTrim(){
        //修葺PlantField外部环境的具体方法
    }
}
