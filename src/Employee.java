// Flyweight
class Employee {
    private static Employee instance = new Employee();

    static Employee getEmployee(){
        System.out.println("You have successfully employ someone!");
        return instance;
    }

    private Employee(){
    }

    void Harvest(){
        // for plant in PlantList: plant.harvest() --- adaptor
        // for animal in AnimalList: Animal.produceWith/WithoutDeath()
    }

    void Plant(){
        // new some staff
    }

    void Fertile(){
        // fertile plants
    }

}
