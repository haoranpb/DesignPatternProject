public class Main {

    public static void main(String[] args) {
        Farmer farmer = Farmer.getTheFarmer(); // only one farmer
        Employee empolyee = farmer.employSomeOne(); // all employees using the same memory space

    }
}
