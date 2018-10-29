package Plant.Abstractory;

import Base.Plant;
import Plant.Rice;
import Plant.Corn;
import Plant.Pasture;

public class PlantFactory implements Abstractory{
    /**
     * get a new rice
     * @return new rice
     */
    public Plant getRice(){
        return new Rice();
    }

    /**
     * get a new corn
     * @return new corn
     */
    public Plant getCorn(){
        return new Corn();
    }

    /**
     * get a new pasture
     * @return new pasture
     */
    public Plant getPasture(){
        return new Pasture();
    }
}
