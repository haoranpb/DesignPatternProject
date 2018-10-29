package Person;

// Flyweight
public class Employee {
    private static Employee instance = new Employee();

    public static Employee getEmployee(){
        System.out.println("You have successfully employ someone!");
        return instance;
    }

    private Employee(){
    }

    public void Harvest(){ // Animal or Plants
        // for plant in PlantList: plant.harvest() --- adaptor
        // seeds ++(or seeds already ++ in harvest function)

        // for animal in AnimalList: Animal.produceWith/WithoutDeath()
    }

    public void Plant(){
        // new some staff
    }

    public void Fertilize(){
        // fertile plants
    }

    public void growAnimal(){
        //grow some animals
    }

}
