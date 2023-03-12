package Task3;

public class Human implements Say, Kindness, Walk {

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

    wal
}
