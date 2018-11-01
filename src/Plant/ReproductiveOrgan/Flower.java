/**
 * flower
 * derived from reproductive organ
 * contain pistil and stamen
 * @author TMY, QXC
 */

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
        this.addPistil(new Pistil());
        this.addStamen(new Stamen());
    }

    /**
     * get the stamen
     */
    public Stamen getStamen(){
        return stamen;
    }

    /**
     * add a stamen
     */
    public void addStamen(Stamen stamen){
        this.stamen = stamen;
    }

    /**
     * get the pistil
     */
    public Pistil getPistil(){
        return pistil;
    }

    /**
     * add a pistil
     */
    public void addPistil(Pistil pistil){
        this.pistil = pistil;
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

    /**
     * show flower message
     */
    public void showMessage(){
        System.out.println("this is the flower.");
    }
}
