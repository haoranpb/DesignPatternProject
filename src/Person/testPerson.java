package Person;


public class testPerson {
    public static void show(){
        System.out.println("\n\n------------Singleton test in Person------------");
        System.out.println("The program should begin with creating a Farmer!");
        Farmer farmer = Farmer.getTheFarmer(); // only one farmer

        System.out.println("\n\n------------FlyWeight test in Person------------");
        System.out.println("Now the Farmer can employ some hardworking employees.");
        Employee empolyee = EmployeeFactory.getEmployee();
        Employee empolyee2 = EmployeeFactory.getEmployee();

        System.out.println("\n\n------------Builder test in Item------------");
        System.out.println("As there are some people, they together can build a farmland!");
        farmer.buildBuilding();


        System.out.println("\n\n------------Proxy test in Person------------");
        System.out.println("The farmer is really lazy, so all the work can only be done by employee");
        empolyee.raiseEveryAnimal();
        empolyee.raisePig();

        System.out.println("\n\n------------Decorator test in Person------------");
        System.out.println("When all the employee is not available, the farmer can do his work via a decorator.");
        FarmerDecorator decorator = new FarmerDecorator(empolyee);
        decorator.raiseChicken();
        farmer.getAnimalNumber();

        System.out.println("\n\n------------Observer test in Person------------");
        System.out.println("The farmer is getting hungry, so the employee kill the animals for meet.");
        empolyee.produceAnimal("death");
        empolyee.getAnimalNumber();

        System.out.println("\nNow the farmer is tired of the meet, he want some plants instead.");
        System.out.println("Before we plant anything, we should shop some seeds");
        farmer.shopSomeSeeds();
        empolyee.getPlants();
        empolyee.takeCareOfPlants();


        System.out.println("\n\n------------Visitor test in Person------------");
        System.out.println("The employee know little about math, so they can only get employee number via visitor!");
        EmloyeeNumberVisitor visitor = new EmloyeeNumberVisitor();
        farmer.acceptEmployeeVisit(visitor);

        System.out.println("\n\n------------Facade test in Person------------");
        System.out.println("The Farm can order the employee to raise animals");
        farmer.raiseEveryAnimal();
        farmer.produceAnimal("withoutdeath");

        System.out.println("Let's see what we get by growing plants and raising animals");
        farmer.showAnimalProcut();
        farmer.showPlantProduct();
    }
}
