/**
 * Mediator for pollination
 * implements Mediator
 * @author TMY, QXC
 */

package Plant.Mediator;

import Plant.ReproductiveOrgan.Flower;
import Plant.ReproductiveOrgan.FlowerState;
import Plant.ReproductiveOrgan.Pistil;
import Plant.ReproductiveOrgan.Stamen;

public class PollinationMediator implements Mediator {
    /**
     * one stamen
     */
    protected Stamen stamen;
    /**
     * three pistils
     */
    protected Pistil pistil;

    /**
     * Constructor
     * @param stamen the stamen
     * @param pistil the pistil
     */
    public PollinationMediator(Stamen stamen, Pistil pistil){
        this.stamen = stamen;
        this.pistil = pistil;
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
    }

    /**
     * the effect that stamen got from pistil, actually nothing
     */
    public void pistilAffectStamen(){
        //do nothing
    }
}
