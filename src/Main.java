import Person.*;

// 13120519039
public class Main {

    public static void main(String[] args) {
        Farmer farmer = Farmer.getTheFarmer(); // only one farmer
        Employee empolyee = farmer.employSomeOne(); // all employees using the same memory space
        empolyee.raiseEveryAnimal();
        empolyee.getAnimalNumber();
    }
}
