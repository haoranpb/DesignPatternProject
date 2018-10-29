package Item.Building;

import src.Base.Plant;

import java.util.ArrayList;

/**
 * Composite (Composite Pattern)
 * @author YGH
 * @version 2017-10-29 10:10
 */
public class PlantField extends Plant {

    private static ArrayList<Plant> cornList = new ArrayList();
    private static ArrayList<Plant> riceList = new ArrayList();
    private static ArrayList<Plant> pastureList = new ArrayList();

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
