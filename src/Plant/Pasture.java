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
            System.out.println("This growing plant is now mature.");
        } else if (this.isMature()) {
            this.plantState.moveToNext(this);
            System.out.println("This mature plant is now harvestable.");
        } else if (this.isHarvestable()) {
            System.out.println("This plant is now harvestable. Stop fertilizing it.");
        } else if (this.isDead()) {
            System.out.println("This plant is dead! Leave it alone!");
        }
    }
    /**
     * harvest the plant
     * after harvesting one pasture, you will get no seed and 5 pasture product
     */
    public void harvested(){
        System.out.println("By harvesting this pasture, you got 5 pasture product.");
        PastureProduct.count += 1;
    }

}
