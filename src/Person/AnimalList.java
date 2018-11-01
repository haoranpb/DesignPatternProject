package Person;
import Item.Building.AnimalFolds;
import Base.Animal;
import java.util.ArrayList;

public class AnimalList {
    public ArrayList<ArrayList<Animal>> animalList = new ArrayList<>();

    public AnimalList(){
        animalList.add(AnimalFolds.chickenList);
        animalList.add(AnimalFolds.sheepList);
        animalList.add(AnimalFolds.fishList);
        animalList.add(AnimalFolds.pigList);
    }

    public Interator getIterator(){
        System.out.println("------------Iterator test in Person------------");
        return new Interator();
    }

    public class Interator{
        int index;

        public boolean hasNext(){
            if(index<animalList.size()){
                return true;
            }
            else return false;
        }

        public ArrayList<Animal> next(){
            if(hasNext()){
                return animalList.get(index++);
            }
            return null;
        }
    }
}
