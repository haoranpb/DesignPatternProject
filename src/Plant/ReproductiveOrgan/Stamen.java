/**
 * stamen
 * derives from reproductive plant
 * @author TMY, QXC
 */

package Plant.ReproductiveOrgan;

import Plant.Mediator.PollinationMediator;

public class Stamen extends ReproductiveOrgan {
    /**
     * Constructor
     */
    public Stamen(){
        this.setState(FlowerState.IMMATURE);
    }

    /**
     * get the type of the flower, pistil or stamen
     * @return the type of the flower
     */
    public String getType(){
        return "Stamen";
    }

    /**
     * get the state of the stamen
     * @return the state of the stamen
     */
    public FlowerState getState(){
        return this.state;
    }

    /**
     * set the state of the stamen
     * @param fs new state
     */
    public void setState(FlowerState fs){
        this.state = fs;
    }

    /**
     * pollination
     * for the stamen, it releases the pollen
     */
    public void pollinate(){
        this.setState(FlowerState.MATURE);
    }

    /**
     * pollination
     * correspond with the mediator, find 3 immature pistil
     * @param pm pollination mediator
     */
    public void pollinate(PollinationMediator pm){
        this.pollinate();
        pm.stamenAffectPistil();
    }
}
