package Plant.State;

import Base.Plant;

public class HarvestableState implements PlantState {
    /**
     * the name of the state
     * final
     */
    private final String name = "Harvestable";

    /**
     * get the name of the state
     * @return the name of the state
     */
    public String getStateName(){
        return name;
    }

    /**
     * change the state of the plant
     * @param p the specific plant
     */
    public void moveToNext(Plant p){
        System.out.println("the harvestable " + p.getPlantType() +" has been harvested. now it's dead.");
        p.setPlantState(new DeadState());
    }
}
