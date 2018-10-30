package Item.Fertilizering;

import Item.Fertilizering.Fertilizer;
import Item.Fertilizering.InorganicFertilizer;
import Item.Fertilizering.OrganicFertilizer;

/**
 * 有机化肥生产工厂，继承了抽象工厂类
 * 可以生产有机化肥而生产不了无机化肥
 */
public class OrganicFertilizerFactory extends FertilizerAbstractFactory {
    /**
     * 无法生产无机化肥
     *
     * @param fertilizer
     * @return
     * @author HXP/XYN
     * @version 2018-10-29 23:10
     */

    @Override
    public Fertilizer getInorganicFertilizer(String fertilizer) {
        if (fertilizer == "InorganicFertilizer") {
            return null;
        } else
            return null;
    }

    /**
     * 可以生产有机化肥
     *
     * @param fertilizer
     * @return
     * @author HXP/XYN
     * @version 2018-10-29 23:10
     */

    @Override
    public Fertilizer getOrganicFertilizer(String fertilizer) {
        if (fertilizer == "OrganicFertilizer") {
            return new OrganicFertilizer();
        } else
            return null;
    }
}
