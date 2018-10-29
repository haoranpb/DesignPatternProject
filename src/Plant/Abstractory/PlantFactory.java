package Plant.Abstractory;

import Base.Plant;
import Plant.Rice;
import Plant.Corn;
import Plant.Pasture;

public class PlantFactory implements Abstractory{
    public Plant getRice(){
        return new Rice();
    }
    public Plant getCorn(){
        return new Corn();
    }
    public Plant getPasture(){
        return new Pasture();
    }
}
