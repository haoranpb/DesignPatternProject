package Plant;

import Base.Plant;
import Plant.ReproductiveOrgan.Flower;
import Plant.ReproductiveOrgan.Pistil;
import Plant.ReproductiveOrgan.Stamen;
import Plant.Seed.CornSeed;

public class Corn extends Plant {
    /**
     * the flower of the corn
     */
    public Flower flower;

    /**
     * Constructor
     * specify plant's type
     */
    public Corn(){
        super("Corn");

        flower = new Flower();

        System.out.println("you've got a new corn!");
    }

    /**
     * harvest the plant
     * after harvesting one corn, you will get 5 corn seed and 1 corn product
     */
    public void harvested(){
        if(this.isHarvestable()) {
            this.plantState.moveToNext(this);
            System.out.println("By harvesting this corn, you got 5 corn seeds and 1 corn product.");
            CornSeed.count += 5;
            CornProduct.count += 1;
        }else if(this.isDead()) {
            //do nothing
        }else{
            System.out.println("This " + this.getPlantType() + " hasn't been harvestable yet.");
        }
    }
}
