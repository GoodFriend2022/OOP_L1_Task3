package Task3;

import java.util.Random;

public class Dog extends Animal implements Say, Kindness {
    String answer = "гав-гав";
    String eraser = "веляет хвостиком";
    Random amountWave = new Random();
    int wave = amountWave.nextInt(60, 100);

    public Dog(String name) {
        super(name);
        super.setModel("собака");
    }

    @Override
    public String say() {
        return String.format("%s %s говорит %s мой Человек\n", super.getModel(), super.getName(), this.answer);
    }

    @Override
    public String kindness() {
        return String.format("%s %s %s %d раз в минуту)\n", super.getModel(), super.getName(), this.eraser, this.wave);
    }
}
