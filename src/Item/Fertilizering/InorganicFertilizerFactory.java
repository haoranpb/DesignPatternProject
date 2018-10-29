package src.Item.Fetilizering;

import src.Item.Props.Fertilizer;
import src.Item.Fertilizering.InorganicFertilizer;
import src.Item.Fertilizering.OrganicFertilizer;

/**
 * 有机化肥生产工厂，继承了抽象工厂类
 * 可以生产无机化肥而生产不了有机化肥
 */
public class InorganicFertilizerFactory extends FertilizerAbstractFactory {
    /**
     * 无法生产有机化肥
     * @author HXP
     * @param OrganicFertilizer
     * @return
     */
    @Override
    public Fertilizer getOrganicFertilizer(String fertilizer){
        if(fertilizer == "OrganicFertilizer") {
            return null;
        }
    }

    /**
     * 可以生产无机化肥
     * @author HXP
     * @param InorganicFertilizer
     * @return
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