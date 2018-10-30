package Plant;

import Base.Plant;
import Plant.ReproductiveOrgan.Flower;
import Plant.ReproductiveOrgan.Pistil;
import Plant.ReproductiveOrgan.Stamen;
import Plant.Seed.RiceSeed;

public class Rice extends Plant {
    /**
     * the flower of the rice
     */
    public Flower flower;

    /**
     * Constructor
     * specify plants' type
     */
    public Rice(){
        super("Rice");

        flower = new Flower();

        System.out.println("you've got a new rice!");
    }

    /**
     * harvest the plant
     * after harvesting one rice, you will get 5 rice seeds and 1 rice product
     */
    public void harvested() {
        if (this.isHarvestable()) {
            this.plantState.moveToNext(this);
            System.out.println("By harvesting this rice, you got 5 rice seeds and 1 rice product.");
            RiceSeed.count += 5;
            RiceProduct.count += 1;
        }else if(this.isDead()) {
            //do nothing
        }else{
            System.out.println("This " + this.getPlantType() + " hasn't been harvestable yet.");
        }
    }
}
