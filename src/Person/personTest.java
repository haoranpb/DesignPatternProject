
package Person;


import java.util.Scanner;

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

    public static void testshow(){
        // The program should begin with creating a Farmer!
        Farmer farmer = Farmer.getTheFarmer(); // only one farmer
        System.out.println("Do you need a employee? 1 for yes and 0 for no");
        // Now the Farmer can employ some employees.
        Scanner sc = new Scanner(System.in);
        Employee empolyee = null;
        while(true) {
            int next = sc.nextInt();
            if (next == 1) {
                empolyee = EmployeeFactory.getEmployee();
                break;
            } else if (next == 0) {
                System.out.println("sry, you can not do this");
                System.exit(-1);
            } else {
                System.out.println("sry, you can not do this and try again.");
            }
        }
        // Let's build a farmland!
        System.out.println("You must need some fundamental building, right? 1 for yes and 0 for no");
        while(true) {
            int next = sc.nextInt();
            if(next==1) {
                farmer.buildBuilding();
                break;
            }else if (next == 0) {
                System.out.println("sry, you can not do this");
                System.exit(-1);
            } else {
                System.out.println("sry, you can not do this and try again.");
            }
        }

        // "The farmer is really lazy, so all the work can only be done by employee"
        System.out.println("Firstly, you need some animals ,do you? 1 for yes, 0 for no.");
        while(true) {
            int next = sc.nextInt();
            if(next==1) {
                empolyee.raiseEveryAnimal();
                empolyee.raisePig();
                break;
            }else if (next == 0) {
                System.out.println("sry, you can not do this");
                System.exit(-1);
            } else {
                System.out.println("sry, you can not do this and try again.");
            }
        }

        // The farmer can do his work via decorator.



        FarmerDecorator decorator = new FarmerDecorator(empolyee);
        decorator.raiseChicken();
        farmer.getAnimalNumber();


        System.out.println("Now you can choose to get the production through killing animals, 1 for yes, 0 for no.");
        while(true) {
            int next = sc.nextInt();
            if(next==1) {
                empolyee.produceAnimal("death");
                empolyee.getAnimalNumber();
                break;
            }else if (next == 0) {
                System.out.println("sry, you can not do this");
                System.exit(-1);
            } else {
                System.out.println("sry, you can not do this and try again.");
            }
        }
        // Before we plant anything, we should shop some seeds
        System.out.println("Now you need some seeds to plant. 1 for yes, 0 for no");
        while(true) {
            int next = sc.nextInt();
            if(next==1) {
                farmer.shopSomeSeeds();
                break;
            }else if (next == 0) {
                System.out.println("sry, you can not do this");
                System.exit(-1);
            } else {
                System.out.println("sry, you can not do this and try again.");
            }
        }

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
        System.out.print("Now you can let your employee to get eggs, 1 for yes and 0 for no\n");
        while(true) {
            int next = sc.nextInt();
            if(next==1) {
                farmer.raiseEveryAnimal();
                farmer.produceAnimal("withoutdeath");
                break;
            }else if (next == 0) {
                System.out.println("sry, you can not do this");
                System.exit(-1);
            } else {
                System.out.println("sry, you can not do this and try again.");
            }
        }


        System.out.println("Let's see what we get here");
        farmer.showAnimalProcut();
        farmer.showPlantProduct();
    }

}