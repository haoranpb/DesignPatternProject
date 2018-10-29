package Base;

import Plant.State.PlantState;

abstract public class Plant {
    public PlantState plantState = null;
    public String plantType;

    public Plant(String type){
        this.plantType = type;
    }
    abstract public void fertilized();
    abstract public void harvested();
    abstract public String getPlantState();
    abstract public void setPlantState(PlantState ps);
    abstract public boolean isGrowing();
    abstract public boolean isMature();
    abstract public boolean isHarvestable();
    abstract public boolean isDead();
}
