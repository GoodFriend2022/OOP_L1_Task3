package Task3;

import java.util.Random;

public class Dog extends Mammal implements Say, Kindness {
    String answer = "гав-гав";
    String eraser = "веляет хвостиком";
    Random r = new Random();
    int wave = r.nextInt(60, 100);

    public Dog(String name) {
        super(name);
        super.setModel("собака");
    }

    @Override
    public String say(Mammal ml) {
        return String.format("%s %s говорит %s мой %s\n", super.getModel(), super.getName(), this.answer, ml.getModel());
    }

    @Override
    public String kindness(Mammal ml) {
        return String.format("%s %s %s %d раз в минуту)\n", super.getModel(), super.getName(), this.eraser, this.wave);
    }
}
