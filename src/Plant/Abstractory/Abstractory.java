package Plant.Abstractory;

import Base.Plant;
import Plant.Pasture;
import Plant.Corn;
import Plant.Rice;

public interface Abstractory {
    Rice getRice();
    Corn getCorn();
    Pasture getPasture();
}
