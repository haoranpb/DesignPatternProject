package Plant.Strategy;

import Item.Building.PlantField;
import Plant.Corn;
import Plant.Flower.Pistil;
import Plant.Flower.Stamen;
import Plant.Mediator.PollinationMediator;
import Plant.Rice;

public class ArtificialPollination implements PollinationStrategy{
    /**
     * artificial pollination
     * @param plant type of plant
     */
    public void pollinate(String plant){
        System.out.println("he chooses artificial pollination.");

        PollinationMediator pm = new PollinationMediator(null,null);

        switch(plant){
            case "Corn":
                for(Corn c : PlantField.cornList) {
                    if (c.plantState.getStateName() == "Mature") {
                        pm.setPistil(c.pistil);
                        pm.setStamen(c.stamen);

                        c.stamen.pollinate(pm);
                        c.pistil.pollinate(pm);

                        c.plantState.moveToNext(c);
                        System.out.println("artificial pollination completed. Now the plant is harvestable!");
                    }
                }
                break;
            case "Rice":
                for(Rice r : PlantField.riceList){
                    if(r.plantState.getStateName() == "Mature"){
                        pm.setStamen(r.stamen);
                        pm.setPistil(r.pistil);

                        r.stamen.pollinate(pm);
                        r.pistil.pollinate(pm);

                        r.plantState.moveToNext(r);
                        System.out.println("artificial pollination completed. Now the plant is harvestable!");
                    }
                }
                break;
        }
    }
}
