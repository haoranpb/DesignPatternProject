package Plant.Mediator;

import Plant.Flower.Flower;
import Plant.Flower.FlowerState;
import Plant.Flower.Pistil;

public class PollinationMediator implements Mediator {
    /**
     * one stamen
     */
    protected Flower stamen;
    /**
     * three pistils
     */
    protected Flower pistil;

    /**
     * Constructor
     * @param a the stamen
     * @param b the pistil
     */
    public PollinationMediator(Flower a, Flower b){
        this.stamen = a;
        this.pistil = b;
    }

    /**
     * the effect that pistil got from stamen, actually getting the pollen
     */
    public void stamenAffectPistil() {
        this.pistil.setState(FlowerState.MATURE);
        System.out.println("the pistil just got the pollen. pollination is complete.");
    }

    /**
     * the effect that stamen got from pistil, actually nothing
     */
    public void pistilAffectStamen(){
        System.out.println("pollination is complete.");
    }
}
