package Plant.ReproductiveOrgan;

public class Flower extends ReproductiveOrgan{
    /**
     * the stamen of the flower
     */
    private Stamen stamen;
    /**
     * the pistil of the flower
     */
    private Pistil pistil;

    /**
     * Constructor
     */
    public Flower(){
        stamen = new Stamen();
        pistil = new Pistil();
    }

    /**
     * get the stamen
     */
    public Stamen getStamen(){
        return stamen;
    }

    /**
     * get the pistil
     */
    public Pistil getPistil(){
        return pistil;
    }

    /**
     * get the type of the organ
     * @return the type of the organ
     */
    public String getType(){
        return "Flower";
    }

    /**
     * do pollination
     */
    public void pollinate(){
        //do nothing
    }

    /**
     * get the state of the organ
     * @return the state of the organ
     */
    public FlowerState getState(){
        return this.state;
    }

    /**
     * set the state of the organ
     * @param fs new state
     */
    public void setState(FlowerState fs){
        this.state = fs;
    }
}
