import Item.Building.Building;
import Person.*;

// 13120519039
public class Main {

    public static void main(String[] args) {
        Farmer farmer = Farmer.getTheFarmer(); // only one farmer
        Employee empolyee = farmer.employSomeOne(); // all employees using the same memory space
//        empolyee.raiseEveryAnimal();
//        empolyee.getAnimalNumber();
        farmer.shopSomeSeeds();
        empolyee.plant();
        empolyee.fertilize();
        empolyee.pollination();
        empolyee.harvest();
        farmer.showPlantProduct();

        Building building = new Building.Builder()
                .setHeight(100)
                .setLength(100)
                .setWidth(100)
                .construct();
        System.out.println("We have constructed a new building!");
    }
}
