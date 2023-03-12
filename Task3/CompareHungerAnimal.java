package Task3;

import java.util.Comparator;

public class CompareHungerAnimal implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getHungerLevel() - o2.getHungerLevel();
    }
}
