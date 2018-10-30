import Item.Building.Building;
import Person.*;

// 13120519039
public class Main {

    public static void main(String[] args) {
        Farmer farmer = Farmer.getTheFarmer(); // only one farmer
        Employee employee = farmer.employSomeOne(); // all employees using the same memory space
//        employee.raiseEveryAnimal();
//        employee.getAnimalNumber();
        Building building = new Building.Builder()
                .setHeight(100)
                .setLength(100)
                .setWidth(100)
                .construct();
        System.out.println("We have constructed a new building!");

        farmer.shopSomeSeeds();
        employee.plant();
        employee.fertilize();
        employee.fertilizePasture();
        employee.pollination();
        employee.harvest();
        farmer.showPlantProduct();


    }
}
