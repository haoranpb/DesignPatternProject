package Plant.Flower;

import Plant.Mediator.PollinationMediator;

public class Pistil implements Flower {
    /**
     * the state of the pistil
     */
    private FlowerState state;

    /**
     * Constructor
     */
    public Pistil(){
        this.setState(FlowerState.IMMATURE);
    }
    /**
     * get the type of the flower, pistil or stamen
     * @return the type of the flower
     */
    public String getType(){
        return "Pistil";
    }

    /**
     * get the state of the pistil
     * @return the state of the pistil
     */
    public FlowerState getState(){
        return this.state;
    }

    /**
     * set the state of the pistil
     * @param fs new state
     */
    public void setState(FlowerState fs){
        this.state = fs;
    }

    /**
     * pollination
     * for the pistil, it gets the pollen from one stamen
     */
    public void pollinate(){
        System.out.println("the pistil just got the pollen. it's pollinated.");
        this.setState(FlowerState.MATURE);
    }

    /**
     * pollination
     * correspond with the mediator, actually do nothing
     * @param pm pollination mediator
     */
    public void pollinate(PollinationMediator pm){
        this.pollinate();
        pm.pistilAffectStamen();
    }

}
