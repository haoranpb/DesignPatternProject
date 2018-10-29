package src.Item.Fetilizering;

import src.Item.Props.Fertilizer;
import src.Item.Fertilizering.InorganicFertilizer;
import src.Item.Fertilizering.OrganicFertilizer;

/**
 * 有机化肥生产工厂，继承了抽象工厂类
 * 可以生产有机化肥而生产不了无机化肥
 */
public class OrganicFertilizerFactory extends FertilizerAbstractFactory {
    /**
     * 无法生产无机化肥
     * @author HXP
     * @param InorganicFertilizer
     * @return
     */
    @Override
    public Fertilizer getInorganicFertilizer(String fertilizer){
        if(fertilizer == "InorganicFertilizer") {
            return null;
        }
    }

    /**
     * 可以生产有机化肥
     * @author HXP
     * @param OrganicFertilizer
     * @return
     */
    @Override
    public Fertilizer getOrganicFertilizerr(String fertilizer) {
        if(fertilizer == "OrganicFertilizer"){
            return new OrganicFertilizer();
        }
        else
            return null;
    }
}
