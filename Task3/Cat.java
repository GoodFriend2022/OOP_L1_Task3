package Task3;

public class Cat extends Animal {
    String answer = "meow";
    String araser = "purr";

    public String sayAnimal() {
        return String.format("%s %s\n", super.sayAnimal(), this.answer);
    }

    public String caressed() {
        return String.format("%s and %s\n", super.caressed(), this.araser);
    }
}
