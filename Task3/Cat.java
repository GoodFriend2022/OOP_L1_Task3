package Task3;

public class Cat extends Animal implements Say, Kindness {
    String answer = "мяу";
    String araser = "мурлыкает";
    
    public Cat(String name) {
        super(name);
        super.setModel("котёнок");
    }

    @Override
    public String say() {
        return String.format("%s %s отвечает %s мой Человек)\n", super.getModel(), super.getName(), this.answer);   
    }

    @Override
    public String kindness() {
        return String.format("%s %s %s\n", super.getModel(), super.getName(), this.araser);   
    }
}
