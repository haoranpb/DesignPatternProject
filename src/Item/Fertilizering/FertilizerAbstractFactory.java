package src.Item.Fetilizering;

import src.Item.Props.Fertilizer;
import src.Item.Fertilizering.InorganicFertilizer;
import src.Item.Fertilizering.OrganicFertilizer;

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
