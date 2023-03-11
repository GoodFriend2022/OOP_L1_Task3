package Task3;

public abstract class Mammal {
    private String model;
    private String name;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public Mammal(String name) { this.name = name; }
    
    public Mammal() { this("noname"); }
}
