package Item.Building;

import src.Base.Animal;
import java.util.ArrayList;

/**
 * @author HXP
 * @version 2017-10-29 19:14
 */

public class Storage extends AgricultureProducts {

    private int num;

}

public class Storage extends Plant {

    private int pasture_num;

}

public class StorageConstruction extend BuildingConstruction{
    @Override
    public void  ConstructionBuilding(){
        //建造Storage主体建筑的具体方法
    }
    @Override
    public void  ExteriorTrim(){
        //修葺Storage外部环境的具体方法
    }
}
