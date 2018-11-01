/**
 * Test
 * for testing
 * @author TMY
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
    public static void show() {
        System.out.println("Let's see what we have in the storage now.");
        System.out.println("Pasture seeds: " + PastureSeed.count + "\tPasture product : " + PastureProduct.count);
        System.out.println("Corn seeds: " + CornSeed.count + "\t\tCorn product : " + CornProduct.count);
        System.out.println("Rice seeds: " + RiceSeed.count + "\t\tRice product : " + RiceProduct.count);
    }

    /**
     * test for abstract factory
     * get new plants
     */
    public static void AbstractFactoryTest() {
        System.out.println("------------------Abstract Factory in Plant------------------");
        System.out.println("Let's get different kinds of new plants!");

        PlantFactory pf = new PlantFactory();
        for (int number = 0; number < 5; number++) {
            Corn newCorn = pf.getCorn();
            if (newCorn == null) break;

            PlantField.cornList.add(newCorn);
        }
        for (int number = 0; number < 10; number++) {
            Rice newRice = pf.getRice();
            if (newRice == null) break;

            PlantField.riceList.add(newRice);
        }
        for (int number = 0; number < 2; number++) {
            Pasture newPasture = pf.getPasture();
            if (newPasture == null) break;

            PlantField.pastureList.add(newPasture);
        }

        System.out.println("Now we got different plants!");
    }

    /**
     * test for composite
     * show the structure of flower
     */
    public static void CompositeTest(Corn c) {
        System.out.println("------------------Composite in Plant------------------");
        System.out.println("Every corn has one reproductive organ, aka flower, which contains one pistil and one stamen.");
        c.flower.showMessage();
        c.flower.getPistil().showMessage();
        c.flower.getStamen().showMessage();
    }

    /**
     * test for mediator, strategy and state
     * pollinate
     */
    public static void MediatorAndStrategyTest() {
        System.out.println("------------------Mediator & State & Strategy in Plant------------------");
        System.out.println("Oops, those corns and rices need to be pollinated.");
        for (Corn item : PlantField.cornList) {
            PollinationStrategy ps = new SpontaneousPollination();
            ps.pollinate(item);
        }
        for(Rice item : PlantField.riceList){
            PollinationStrategy ps = new ArtificialPollination();
            ps.pollinate(item);
        }

        System.out.println("\nWe just pollinated those corns. Let's harvest them!");
        for (Corn item : PlantField.cornList) {
            item.harvested();
        }
        for(Rice item : PlantField.riceList){
            item.harvested();
        }
    }

    /**
     * test for template method and state
     * fertilize and harvest
     */
    public static void TemplateMethodAndStateTest() {
        System.out.println("------------------State & Template Method in Plant------------------");
        System.out.println("Let's fertilize those plants!");
        for (Corn item : PlantField.cornList) {
            item.fertilized();
        }
        for (Pasture item : PlantField.pastureList) {
            item.fertilized();
        }

        System.out.println("Those pastures need to be fertilized twice.");
        System.out.println("Let's try to fertilize them again.");
        for (Corn item : PlantField.cornList) {
            item.fertilized();
        }
        for (Rice item : PlantField.riceList) {
            item.fertilized();
        }
        for (Pasture item : PlantField.pastureList) {
            item.fertilized();
        }

        System.out.println("Now they are harvestable. Let's harvest them!");
        for (Corn item : PlantField.cornList) {
            item.harvested();
        }
        for (Rice item : PlantField.riceList) {
            item.harvested();
        }
        for (Pasture item : PlantField.pastureList) {
            item.harvested();
        }
    }
}
