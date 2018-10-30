package Item.Fertilizering;

import Item.Fertilizering.Fertilizer;
import Item.Fertilizering.InorganicFertilizer;
import Item.Fertilizering.OrganicFertilizer;

/**
 * Factory(Factory Pattern)
 * @author XYN/HXP
 * @version 2018-10-29 21:10
 */

/**
 * 化肥生产工厂
 * 可以生产两种化肥
 */
public abstract class FertilizerAbstractFactory {

    /**
     * 根据化肥的名字来获取化肥的实例
     * @author HXP
     * @param fertilizer
     * @return
     */
    public abstract Fertilizer getOrganicFertilizer(String fertilizer);
    public abstract Fertilizer getInorganicFertilizer(String fertilizer);

}
