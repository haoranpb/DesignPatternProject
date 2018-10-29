package Plant.State;

import Base.Plant;

public class MatureState implements PlantState{
    /**
     * the name of the state
     * final
     */
    private final String name = "Mature";

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
        System.out.println("the mature plant is now harvestable.");
        p.setPlantState(new HarvestableState());
    }
}
