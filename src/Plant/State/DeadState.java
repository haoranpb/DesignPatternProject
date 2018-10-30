/**
 * dead state
 * implements plant state
 * @author TMY, QXC
 */

package Plant.State;

import Base.Plant;

public class DeadState implements PlantState {
    /**
     * the name of the state
     */
    private final String name = "Dead";

    /**
     * get the name of the state
     * @return the name of the state
     */
    public String getStateName(){return name;}

    /**
     * change the state of the plant
     * don't do anything, this plant is already dead
     * @param p the specific plant
     */
    public void moveToNext(Plant p){
        System.out.println("this is a dead " + p.getPlantType() +". leave it alone.");
    }
}
