/**
 * Test
 * for testing
 * @author TMY, QXC
 */

package Plant;

import Plant.AbstractFactory.PlantFactory;
import Plant.Seed.CornSeed;
import Plant.Seed.PastureSeed;
import Plant.Seed.RiceSeed;
import Plant.Strategy.ArtificialPollination;
import Plant.Strategy.PollinationStrategy;
import Plant.Strategy.SpontaneousPollination;
import Item.Building.PlantField;

public class Test {
    /**
     * show numbers of everything in the plant storage
     */
    public static void show(){
        System.out.println("\nLet's see what we have in the storage now.");
        System.out.println("Pasture seeds: " + PastureSeed.count + "\tPasture product : " + PastureProduct.count);
        System.out.println("Corn seeds: " + CornSeed.count + "\t\tCorn product : " + CornProduct.count);
        System.out.println("Rice seeds: " + RiceSeed.count + "\t\tRice product : " + RiceProduct.count);
    }

    public static void main(String[] args) {
        System.out.println("Let's get different kinds of new plants!");

        PlantFactory pf = new PlantFactory();
        for(int number = 0; number < 5; number++) {
            Corn newCorn = pf.getCorn();
            if(newCorn == null) break;

            PlantField.cornList.add(newCorn);
        }
        for(int number = 0;number < 10; number++) {
            Rice newRice = pf.getRice();
            if(newRice == null) break;

            PlantField.riceList.add(newRice);
        }
        for(int number = 0;number < 2;number++) {
            Pasture newPasture = pf.getPasture();
            if(newPasture == null) break;

            PlantField.pastureList.add(newPasture);
        }

        System.out.println("Now we got different plants!");
        show();

        System.out.println("\nLet's fertilize those plants!");
        for (Corn item : PlantField.cornList) {
            item.fertilized();
        }
        for (Pasture item : PlantField.pastureList) {
            item.fertilized();
        }

        System.out.println("\nLet's try to fertilize them again.");
        for (Corn item : PlantField.cornList) {
            item.fertilized();
        }
        for (Rice item : PlantField.riceList) {
            item.fertilized();
        }
        for (Pasture item : PlantField.pastureList) {
            item.fertilized();
        }
        System.out.println("\nLet's harvest them!");
        for(Corn item : PlantField.cornList){
            item.harvested();
        }
        for(Rice item : PlantField.riceList){
            item.harvested();
        }
        for(Pasture item : PlantField.pastureList){
            item.harvested();
        }

        show();

        System.out.println("Maybe we need to buy some seeds.");

        System.out.println("\nOops, those corns and rices need to be pollinated.");
        for(Corn item : PlantField.cornList){ // corn and rise need to be poll
            PollinationStrategy ps = new SpontaneousPollination();
            ps.pollinate(item);
        }

        System.out.println("\nWe just pollinated those corns. Let's harvest them!");
        for(Corn item : PlantField.cornList){
            item.harvested();
        }

        show();
// ------
        System.out.println("\nTake a look at those dead plant.");
        for(Corn item : PlantField.cornList){
            item.harvested();
            item.fertilized();
            PollinationStrategy ps = new ArtificialPollination();
            ps.pollinate(item);
        }

        System.out.println("\nTest completed successfully");
    }
}
