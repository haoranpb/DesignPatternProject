
package Person;


public class personTest {
    public static void show(){
        // The program should begin with creating a Farmer!
        Farmer farmer = Farmer.getTheFarmer(); // only one farmer

        // Now the Farmer can employ some employees.
        Employee empolyee = EmployeeFactory.getEmployee();

        // Let's build a farmland!
        farmer.buildBuilding();


        // "The farmer is really lazy, so all the work can only be done by employee"
        empolyee.raiseEveryAnimal();
        empolyee.raisePig();

        // The farmer can do his work via decorator.
        FarmerDecorator decorator = new FarmerDecorator(empolyee);
        decorator.raiseChicken();
        farmer.getAnimalNumber();

        empolyee.produceAnimal("death");
        empolyee.getAnimalNumber();

        // Before we plant anything, we should shop some seeds
        farmer.shopSomeSeeds();
//        empolyee.plant();
//        empolyee.harvest();
//        empolyee.fertilize();
//        empolyee.fertilizePasture();
//        empolyee.pollination();
//        empolyee.harvest();

        // Get employee number via visitor!
        EmloyeeNumberVisitor visitor = new EmloyeeNumberVisitor();
        farmer.acceptEmployeeVisit(visitor);

        // The Farm can order the employee to raise animals
        farmer.raiseEveryAnimal();
        farmer.produceAnimal("withoutdeath");

        // Let's see what we get here
        farmer.showAnimalProcut();
        farmer.showPlantProduct();
    }
}