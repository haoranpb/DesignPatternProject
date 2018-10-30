package Plant.Strategy;

import Item.Building.PlantField;
import Plant.Corn;
import Plant.Flower.Pistil;
import Plant.Flower.Stamen;
import Plant.Mediator.PollinationMediator;
import Plant.Rice;

public class ArtificialPollination implements PollinationStrategy{
    /**
     * artificial pollination for one single corn
     * @param c the specific corn
     */
    public void pollinate(Corn c){
        if(c.isMature()){
            PollinationMediator pm = new PollinationMediator(c.stamen, c.pistil);

            c.stamen.pollinate(pm);
            c.pistil.pollinate(pm);

            System.out.print("one corn is successfully artificial pollinated. ");
            c.plantState.moveToNext(c);
        }else if(c.isDead()) {
            //do nothing
        }else{
            System.out.println("this plant can't be pollinated! find another one. ");
        }
    }

    /**
     * artificial pollination for one single rice
     * @param r the specific rice
     */
    public void pollinate(Rice r) {
        if (r.isMature()) {
            PollinationMediator pm = new PollinationMediator(r.stamen, r.pistil);

            r.stamen.pollinate(pm);
            r.pistil.pollinate(pm);

            System.out.print("one rice is successfully artificial pollinated.");
            r.plantState.moveToNext(r);
        }else if(r.isDead()) {
            //do nothing
        }else{
            System.out.println("this plant can't be pollinated! find another one.");
        }
    }
}
