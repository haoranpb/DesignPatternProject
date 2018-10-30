/**
 * growing state
 * implements plant state
 * @author TMY, QXC
 */

package Plant.State;

import Base.Plant;

public class GrowingState implements PlantState {
    /**
     * the name of the state
     * final
     */
    private final String name = "Growing";

    /**
     * get the name of the state
     * @return the name of the state
     */
    public String getStateName() {
        return name;
    }

    /**
     * change the state of the plant
     * @param p the specific plant
     */
    public void moveToNext(Plant p){
        System.out.println("the growing " + p.getPlantType() +" is now mature.");
        p.setPlantState(new MatureState());
    }
}
