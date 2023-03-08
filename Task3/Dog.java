package Task3;

import java.util.Random;

public class Dog extends Animal {
    String answer = "woof";
    String eraser = "wagged his tail";
    Random r = new Random();
    int wave = r.nextInt(1, 10);

    public String sayAnimal() {
        return String.format("%s %s\n", super.sayAnimal(), this.answer);
    }

    public String caressed() {
        return String.format("%s and %s %d times\n", super.caressed(), this.eraser, this.wave);
    }
}
