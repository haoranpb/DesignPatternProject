package Item;// Singleton

/**
 * @author XYN/HXP
 * @version 2018-10-29 23:10
 */

class FarmAddress {
    private String name;
    private static FarmAddress instance = new FarmAddress("Caoan Road 4800");

    private FarmAddress(String name){
        this.name = name;
        System.out.println("Farm's address \"" + this.name + "\" is successfully created!");
    }

    static FarmAddress getTheAddress(){
        return instance;
    }
}
