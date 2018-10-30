package Item.Fertilizering;

import Item.Fertilizering.Fertilizer;
import Item.Fertilizering.InorganicFertilizer;
import Item.Fertilizering.OrganicFertilizer;

/**
 * Factory(Factory Pattern)
 * @author XYN/HXP
 * @version 2018-10-29 22:10
 */

/**
 * 有机化肥生产工厂，继承了抽象工厂类
 * 可以生产无机化肥而生产不了有机化肥
 */


public class InorganicFertilizerFactory extends FertilizerAbstractFactory {
    /**
     * 无法生产有机化肥
     * @param fertilizer
     * @return
     * @author HXP/XYN
     * @version 2018-10-29 23:10
     */
    @Override
    public Fertilizer getOrganicFertilizer(String fertilizer){
        if(fertilizer == "OrganicFertilizer") {
            return null;
        }
        else
            return null;
    }

    /**
     * 可以生产无机化肥
     * @param fertilizer
     * @return
     * @author HXP/XYN
     * @version 2018-10-29 23:10
     */
    @Override
    public Fertilizer getInorganicFertilizer(String fertilizer) {
        if(fertilizer == "InorganicFertilizer"){
            return new InorganicFertilizer();
        }
        else
            return null;
    }
}