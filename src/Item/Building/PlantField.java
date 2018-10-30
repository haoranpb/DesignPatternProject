package Item.Building;

import Base.Plant;
import Plant.Corn;
import Plant.Rice;
import Plant.Pasture;
import java.util.ArrayList;

/**
 * Composite&Template(Composite Pattern/Template Method)
 * @author XYN/HXP
 * @version 2018-10-29 23:30
 */
public class PlantField{

    public static ArrayList<Corn> cornList = new ArrayList();
    public static ArrayList<Rice> riceList = new ArrayList();
    public static ArrayList<Pasture> pastureList = new ArrayList();

    public PlantField(){}
}

