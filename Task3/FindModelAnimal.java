package Task3;

import java.util.ArrayList;
import java.util.Iterator;

public class FindModelAnimal {

    public ArrayList<Animal> animals = new ArrayList<>();

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public ArrayList<Animal> findAnimal(String model) {
        ArrayList<Animal> modelAnimals = new ArrayList<>();
        modelAnimals.addAll(this.animals);
        Iterator<Animal> an = modelAnimals.iterator();
        while (an.hasNext()) {
            Animal animal = an.next();
            if (animal.getModel() != model) {
                an.remove();
            }
        }
        return modelAnimals;
    }
    

}
