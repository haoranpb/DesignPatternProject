package Plant.Strategy;

import Item.Building.PlantField;
import Plant.Flower.Pistil;
import Plant.Flower.Stamen;
import Plant.Mediator.PollinationMediator;

public class ArtificialPollination implements PollinationStrategy{
    /**
     * artificial pollination
     */
    public void pollinate(String plant){
        System.out.println("he chooses artificial pollination.");
        //pretend to find one immature stamen and one immature pistil
        //fake ones

        Pistil pistil = new Pistil();
        Stamen stamen = new Stamen();
        PollinationMediator pm = new PollinationMediator(stamen, pistil);
        stamen.pollinate(pm);
        pistil.pollinate(pm);
    }
}
