package Task3;

public class Human extends Mammal implements Say, Kindness {

    public Human(String name) { 
        super(name);
        super.setModel("человек");
    }
    public Human() { 
        super("noname");
        super.setModel("человек");
    }

    @Override
    public String kindness(Mammal ml) {
        String nameAnimal = ml.getName();
        String end = String.valueOf(nameAnimal.charAt(nameAnimal.length() - 1));
        if (end.equalsIgnoreCase("a")) {
            nameAnimal = nameAnimal.substring(0, nameAnimal.length() - 2) + "у";
        } else nameAnimal += "а";
        return String.format("%s ласкает %s\n", super.getName(), nameAnimal);
    }
    
    @Override
    public String say(Mammal ml) {
        return String.format("%s говорит %s хороший %s\n", super.getName(), ml.getName(), ml.getModel()); 
    }
}
