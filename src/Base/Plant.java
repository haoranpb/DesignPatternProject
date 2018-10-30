package Base;

import Plant.State.GrowingState;
import Plant.State.PlantState;

abstract public class Plant {
    /**
     * Plant's state
     */
    public PlantState plantState = null;
    /**
     * Plant's type
     */
    private String plantType;

    /**
     * Constructor
     * @param type plant's type
     */
    public Plant(String type){
        this.plantType = type;
        this.setPlantState(new GrowingState());
    }

    /**
     * get plant's type
     * @return plant's type
     */
    public String getPlantType(){
        return plantType;
    }

    /**
     * see what state the plant is
     */
    public void whatNow(){
        System.out.println("The " + this.getPlantType() + " is now " + this.getPlantState());
    }

    /**
     * fertilize the plant
     */
    public void fertilized(){
        if(this.isGrowing()) {
            this.plantState.moveToNext(this);
        }else if(this.isMature()) {
            System.out.println("This mature " + this.getPlantType() +" needs to be pollinated. Stop fertilizing it.");
        }else if(this.isHarvestable()) {
            System.out.println("This " + this.getPlantType() +" is now harvestable. Stop fertilizing it.");
        }else if(this.isDead()){

        }
    }

    /**
     * harvest the plant
     * abstract
     */
    abstract public void harvested();

    /**
     * get plant's state
     * @return plant's state
     */
    public String getPlantState(){
        return this.plantState.getStateName();
    }
    /**
     * set plant's state
     * @param ps plant's new state
     */
    public void setPlantState(PlantState ps){
        this.plantState = ps;
    }

    /**
     * check whether the plant is growing
     * @return whether the plant is growing
     */
    public boolean isGrowing(){
        return (this.getPlantState() == "Growing");
    }
    /**
     * check whether the plant is mature
     * @return whether the plant is mature
     */
    public boolean isMature(){
        return (this.getPlantState() == "Mature");
    }
    /**
     * check whether the plant is harvestable
     * @return whether the plant is harvestable
     */
    public boolean isHarvestable(){
        return (this.getPlantState() == "Harvestable");
    }
    /**
     * check whether the plant is dead
     * @return whether the plant is dead
     */
    public boolean isDead(){
        return (this.getPlantState() == "Dead");
    }
}
