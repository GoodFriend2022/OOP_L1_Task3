package Task3;

import java.util.Random;

public abstract class Animal {
    private String model;
    private String name;
    Random level = new Random();
    int hungerLevel = level.nextInt(0, 10);

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public Animal(String name) { 
        this.name = name;
        this.getHungerLevel(); 
    }
    
    public Animal() { this("noname"); }

    @Override
    public String toString() {
        return String.format("%s", this.name);
    }
}
