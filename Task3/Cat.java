package Task3;

public class Cat extends Animal {
    String answer = "meow";

    public String sayAnimal() {
        return String.format("%s %s\n", super.sayAnimal(), this.answer);
    }
}
