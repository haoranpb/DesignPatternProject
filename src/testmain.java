import Animal.animalAPP;
import Animal.animalTest;
import Person.personApp;
import Person.personTest;
import Plant.plantApp;
import Plant.plantTest;

import java.util.Scanner;

public class testmain{
        public static void main(String[] args) {
            // You will find sample applications in the function below
            // We run all the API we provide, and there is no error
            personTest.testshow();
            plantTest.show();
            animalTest.show();
            System.out.println("Now let's see the functions with patterns, 1 for yes and 0 for no");
            // App finished
            Scanner sc = new Scanner(System.in);
            while(true) {
                int next = sc.nextInt();
                if(next==1) {
                    animalAPP.show();
                    plantApp.show();
                    personApp.show();
                    break;
                }else if (next == 0) {
                    System.out.println("sry, you can not do this");
                    System.exit(-1);
                } else {
                    System.out.println("sry, you can not do this and try again.");
                }
            }

        }

}
