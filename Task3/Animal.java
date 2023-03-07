package Task3;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) { this.name = name; }
    
    public Animal() { this("noname"); }

    public String sayAnimal() {
        return String.format("%s answers", getClass().getSimpleName());
    }
}
