package Animal;

import Item.AgricultureProducts.*;
import Base.Animal;

public class animalTest {
    public static void show() {

        // We will test all the APIs here
        // The dog is going to sleep.
        Animal.Petdog.sleep();

        // The dog is going to bark.
        Animal.Petdog.bark();

        // Creating a new chicken and a new pig.
        Animal c= new Chicken();
        Animal g= new Pig();

        // The animals are going to sleep.
        c.sleep();
        g.sleep();

        // The animals are going to fight with dog.
        c.fightWithDog();
        g.fightWithDog();

        // The animals are going to exercise.
        c.exe();
        g.exe();

        // Chicken can also run with your set.
        c.exewithset("Run");

        // The animals are going to breed.
        c.breed();
        g.breed();

        // The animals are going to do shower.
        c.shower();
        g.shower();

        // Let's see how many product do we have before animals produce products.
        System.out.println("Chicken meat: " +Chickenmeat.amount+"\nEggs: "+ Eggs.amount) ;
        System.out.println("Pork: " +Pork.amount) ;

        // The animals are going to produce external product.
        c.producewithoutdeath();
        g.producewithoutdeath();

        // The animals are going to produce internal product.
        c.producewithdeath();
        g.producewithdeath();

        // Let's see how many product do we have after animals produce products.
        System.out.println("Chicken meat: " +Chickenmeat.amount+"\nEggs: "+ Eggs.amount) ;
        System.out.println("Pork: " +Pork.amount) ;

        // Get currnet states of the animals.
        c.getstate();
        g.getstate();

        // The dead animals regain life.
        c.setstate();
        g.setstate();
        c.getstate();
        g.getstate();


    }
    public static void main(String[] args) {
        show();
    }
}