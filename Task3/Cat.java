package Task3;

public class Cat extends Mammal implements Say, Kindness {
    String answer = "мяу";
    String araser = "мурлыкает";
    
    public Cat(String name) {
        super(name);
        super.setModel("котёнок");
    }

    @Override
    public String say(Mammal ml) {
        return String.format("%s %s отвечает %s мой %s)\n", super.getModel(), super.getName(), this.answer, ml.getModel());   
    }

    @Override
    public String kindness(Mammal ml) {
        return String.format("%s %s %s\n", super.getModel(), super.getName(), this.araser);   
    }
}
