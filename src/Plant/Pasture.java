package Plant;

import Base.Plant;

public class Pasture extends Plant {
    /**
     * Constructor
     * specify plant's type
     */
    public Pasture(){
        super("Pasture");
        System.out.println("you've got a new pasture!");
    }

    /**
     * fertilize the plant
     */
    @Override
    public void fertilized() {
        if (this.isGrowing()) {
            this.plantState.moveToNext(this);
        } else if (this.isMature()) {
            this.plantState.moveToNext(this);
        } else if (this.isHarvestable()) {
            System.out.println("This " + this.getPlantType() +" is now harvestable. Stop fertilizing it.");
        } else if (this.isDead()) {
            System.out.println("This " + this.getPlantType() +" is dead! Leave it alone!");
        }
    }
    /**
     * harvest the plant
     * after harvesting one pasture, you will get no seed and 5 pasture product
     */
    public void harvested(){
        if(this.isHarvestable()) {
            this.plantState.moveToNext(this);
            System.out.println("By harvesting this pasture, you got 5 pasture product.");
            PastureProduct.count += 5;
        }else if(this.isDead()) {
            //do nothing
        }else{
            System.out.println("This " + this.getPlantType() + " hasn't been harvestable yet. fertilize it.");
        }
    }

}
