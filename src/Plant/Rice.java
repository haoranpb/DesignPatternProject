package Plant;

import Base.Plant;
import Plant.Flower.Pistil;
import Plant.Flower.Stamen;
import Plant.Seed.RiceSeed;

public class Rice extends Plant {
    /**
     * the stamen of the rice
     */
    public Stamen stamen;
    /**
     * the pistil of the rice
     */
    public Pistil pistil;

    /**
     * Constructor
     * specify plants' type
     */
    public Rice(){
        super("Rice");

        stamen = new Stamen();
        pistil = new Pistil();

        System.out.println("you've got a new rice!");
    }

    /**
     * harvest the plant
     * after harvesting one rice, you will get 5 rice seeds and 1 rice product
     */
    public void harvested(){
        this.plantState.moveToNext(this);
        System.out.println("By harvesting this rice, you got 5 rice seeds and 1 rice product.");
        RiceSeed.count += 5;
        RiceProduct.count += 1;
    }
}
