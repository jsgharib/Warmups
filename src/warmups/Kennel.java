package warmups;

import java.util.ArrayList;
import java.util.Collections;
public class Kennel {

    private ArrayList<Animals> kennel;

    public Kennel() {
        kennel = new ArrayList<Animals>();
    }

    public void addAnimal(Animals cat) {
        kennel.add(cat);
    }
    
    public void sortAnimals(){
        Collections.sort(kennel);
         
    }

    public String toString() {
        String animals = "";
        for (Animals j : kennel) {
            animals += j + " ";
        }
        return animals;
    }
}
