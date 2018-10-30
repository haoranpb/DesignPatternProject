/**
 * Plant Factory
 * implements abstract factory
 * @author TMY, QXC
 */

package Plant.AbstractFactory;

import Plant.Rice;
import Plant.Corn;
import Plant.Pasture;
import Plant.Seed.CornSeed;
import Plant.Seed.PastureSeed;
import Plant.Seed.RiceSeed;

public class PlantFactory implements AbstractFactory {
    /**
     * get a new rice
     * @return new rice
     */
    public Rice getRice(){
        if(RiceSeed.count == 0){
            System.out.println("You don't have any rice seed. go buy some");
            return null;
        }

        --RiceSeed.count;
        return new Rice();
    }

    /**
     * get a new corn
     * @return new corn
     */
    public Corn getCorn(){
        if(CornSeed.count == 0){
            System.out.println("You don't have any corn seed. go buy some");
            return null;
        }
        --CornSeed.count;
        return new Corn();
    }

    /**
     * get a new pasture
     * @return new pasture
     */
    public Pasture getPasture(){
        if(PastureSeed.count == 0){
            System.out.println("You don't have any pasture seed. go buy some");
            return null;
        }
        --PastureSeed.count;
        return new Pasture();
    }
}
