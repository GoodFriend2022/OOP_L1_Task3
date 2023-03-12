package Task3;

import java.util.ArrayList;
import java.util.Collections;

public class Human implements Say, Kindness, Walk, Feed {

    String name;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Human(String name) { 
        this.name = name;
    }
    public Human() { 
        this("noname");
    }

    @Override
    public String kindness() {
        return String.format("%s ласкает своего зверька\n", this.getName());
    }
    
    @Override
    public String say() {
        return String.format("%s зовет свего зверька\n", this.getName()); 
    }
    @Override
    public void walk(ArrayList<Animal> animals) {
        String nameAnimals = "";
        for (Animal an : animals) { nameAnimals += an.getName() + " "; }
        System.out.printf("%s повел гулять зверьков по имени %s\n", this.getName(), nameAnimals);
    }
    @Override
    public void feed(ArrayList<Animal> animals) {
        Collections.sort(animals, new CompareHungerAnimal());
        Collections.reverse(animals);
        System.err.printf("%s покормил зверьков по имени %s\n", this.getName(), animals);
    }

        
}
