package Item.Building;

import src.Base.Animal;
import java.util.ArrayList;

/**
 * Composite (Composite Pattern)
 * @author XYN
 * @version 2017-10-29 10:10
 */
public class AnimalFolds extends Animal {

    private static ArrayList<Animal> pigList = new ArrayList();
    private static ArrayList<Animal> sheepList = new ArrayList();
    private static ArrayList<Animal> fishList = new ArrayList();
    private static ArrayList<Animal> chickenList = new ArrayList();

    public AnimalFolds(){}

}

public class AnimalFoldsConstruction extend BuildingConstruction{
    @Override
    public void  ConstructionBuilding(){
        //建造Animal Folds主体建筑的具体方法
    }
    @Override
    public void  ExteriorTrim(){
        //修葺Animal Folds外部环境的具体方法
    }
}


