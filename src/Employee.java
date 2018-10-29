// Flyweight
class Employee {
    private static Employee instance = new Employee();

    static Employee getEmployee(){
        System.out.println("You have successfully employ someone!");
        return instance;
    }

    private Employee(){
    }

    void Harvest(){ // Animal or Plants
        // for plant in PlantList: plant.harvest() --- adaptor
        // seeds ++(or seeds already ++ in harvest function)

        // for animal in AnimalList: Animal.produceWith/WithoutDeath()
    }

    void Plant(){
        // new some staff
    }

    void Fertilize(){
        // fertile plants
    }

    void growAnimal(){
        //grow some animals
    }

}
