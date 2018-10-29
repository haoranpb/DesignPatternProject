package Plant.Mediator;

import Plant.Flower.Flower;
import Plant.Flower.FlowerState;
import Plant.Flower.Pistil;
import Plant.Flower.Stamen;

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
     * set the stamen of the mediator
     * @param s new stamen
     */
    public void setStamen(Stamen s){
        this.stamen = s;
    }

    /**
     * set the pistil of the mediator
     * @param p new pistil
     */
    public void setPistil(Pistil p){
        this.pistil = p;
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
