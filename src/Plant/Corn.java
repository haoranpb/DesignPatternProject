package Plant;

import Base.Plant;
import Plant.Flower.Pistil;
import Plant.Flower.Stamen;
import Plant.Seed.CornSeed;

public class Corn extends Plant {
    /**
     * the stamen of the corn
     */
    public Stamen stamen;
    /**
     * the pistil of the corn
     */
    public Pistil pistil;

    /**
     * Constructor
     * specify plant's type
     */
    public Corn(){
        super("Corn");

        stamen = new Stamen();
        pistil = new Pistil();

        System.out.println("you've got a new corn!");
    }

    /**
     * harvest the plant
     * after harvesting one corn, you will get 5 corn seed and 1 corn product
     */
    public void harvested(){
        this.plantState.moveToNext(this);
        System.out.println("By harvesting this corn, you got 5 corn seeds and 1 corn product.");
        CornSeed.count += 5;
        CornProduct.count += 1;
    }
}
