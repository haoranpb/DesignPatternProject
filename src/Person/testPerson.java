package Person;


public class testPerson {
    public static void show(){
        System.out.println("The program should begin with creating a Farmer!");
        Farmer farmer = Farmer.getTheFarmer(); // only one farmer

        System.out.println("Now the Farmer can employ some employees.");
        Employee empolyee = EmployeeFactory.getEmployee();

        System.out.println("Let's build a farmland!");
        farmer.buildBuilding();


        System.out.println("The farmer is really lazy, so all the work can only be done by employee");
        empolyee.raiseEveryAnimal();
        empolyee.raisePig();

        System.out.println("The farmer can do his work via decorator.");
        FarmerDecorator decorator = new FarmerDecorator(empolyee);
        decorator.raiseChicken();
        farmer.getAnimalNumber();

        empolyee.produceAnimal("death");
        empolyee.getAnimalNumber();

        System.out.println("Before we plant anything, we should shop some seeds");
        farmer.shopSomeSeeds();
        empolyee.plant();
        empolyee.harvest();
        empolyee.fertilize();
        empolyee.fertilizePasture();
        empolyee.pollination();
        empolyee.harvest();

        System.out.println("Get employee number via visitor!");
        EmloyeeNumberVisitor visitor = new EmloyeeNumberVisitor();
        farmer.acceptEmployeeVisit(visitor);

        System.out.println("The Farm can order the employee to raise animals");
        farmer.raiseEveryAnimal();
        farmer.produceAnimal("withoutdeath");

        System.out.println("Let's see what we get here");
        farmer.showAnimalProcut();
        farmer.showPlantProduct();
    }
}
