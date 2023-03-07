package Task3;

public class Dog extends Animal {
    String answer = "woof";

    public String sayAnimal() {
        return String.format("%s %s\n", super.sayAnimal(), this.answer);
    }
}
