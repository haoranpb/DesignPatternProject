package Animal;

import Animal.*;
import Item.AgricultureProducts.*;
import Item.Building.PlantField;
import Base.Animal;

public class testAnimal {
	 public static void show() {
		 	
		 	System.out.println("-----------------------------------");
		 	System.out.println("The dog is going to sleep.\n");
		 	Animal.Petdog.sleep();
		 	
		 	System.out.println("-----------------------------------");
		 	System.out.println("The dog is going to bark.\n");
		 	Animal.Petdog.bark();
		 	
		 	System.out.println("-----------------------------------");
		    System.out.println("Creating a new chicken and a new pig.");
			Animal c= new Chicken();
			Animal g= new Pig();
			
			System.out.println("-----------------------------------");
			System.out.println("The animals are going to sleep.\n");
			c.sleep();
			g.sleep();
			
			System.out.println("-----------------------------------");
			System.out.println("The animals are going to fight with dog.\n");
			c.fightWithDog();
			g.fightWithDog();
			
			System.out.println("-----------------------------------");
			System.out.println("The animals are going to exercise.\n");
			c.exe();
			g.exe();
			
			System.out.println("-----------------------------------");
			System.out.println("Chicken can also run with your set.\n");
			c.exewithset("Run");
			
			System.out.println("-----------------------------------");
			System.out.println("The animals are going to breed.\n");
			c.breed();
			g.breed();
			
			System.out.println("-----------------------------------");
			System.out.println("The animals are going to do shower.\n");
			c.shower();
			g.shower();
			
			System.out.println("-----------------------------------");
			System.out.println("Let's see how many product do we have before animals produce products.\n");
			System.out.println("Chicken meat: " +Chickenmeat.amount+"\nEggs: "+ Eggs.amount) ;
			System.out.println("Pork: " +Pork.amount) ;
			
			System.out.println("-----------------------------------");
			System.out.println("The animals are going to produce external product.\n");
			c.producewithoutdeath();
			g.producewithoutdeath();
			
			System.out.println("-----------------------------------");
			System.out.println("The animals are going to produce internal product.\n");
			c.producewithdeath();
			g.producewithdeath();
			
			System.out.println("-----------------------------------");
			System.out.println("Let's see how many product do we have after animals produce products.\n");
			System.out.println("Chicken meat: " +Chickenmeat.amount+"\nEggs: "+ Eggs.amount) ;
			System.out.println("Pork: " +Pork.amount) ;
			
			System.out.println("-----------------------------------");
			System.out.println("Get currnet states of the animals.\n");
			c.getstate();
			g.getstate();
			
			System.out.println("-----------------------------------");
			System.out.println("The dead animals regain life.\n");
			c.setstate();
			g.setstate();
			c.getstate();
			g.getstate();
			
			
	 }
	 public static void main(String[] args) {
		 show();
	 }
}
