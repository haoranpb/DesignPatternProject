package src.Item.Building;

import src.Item.Building.AnimalFolds;
import src.Item.Building.House;
import src.Item.Building.PlantField;
import src.Item.Building.Storage;

/**
 * Composite (Template Method)
 * @author HXP
 * @version 2018-10-29 19:30
 */
public abstract class BuildingConstruction {
    //模板方法:建造建筑的流程
    //申明为final，不希望子类覆盖该方法，防止更改流程的执行顺序
    final void ConstructionProcess(){
        //第一步:夯实地基
        this.LayFoundation();
        //第二步:建造主体
        this.ConstructionBuilding();
        //第三步:外部修葺
        this.ExteriorTrim();
    }

    //定义结构哪些方法是所有过程都是可复用的，哪些是需要子类进行实现的

    void LayFoundation(){
        //夯实地基
    }
    abstract void ConstructionBuilding()
    abstract void ExteriorTrim()

}
