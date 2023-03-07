package Task3;

public class Human {
    private String name;

    public String getName() {
        return name;
    }

    public Human(String name) { this.name = name; }
    public Human() { this("unknown"); }

    public void pat(Species sp) {
        String name = this.name;
        System.out.printf("%s pet the %s\n", name, sp);
    }

    public void call(Species sp) {
        String name = this.name;
        System.out.printf("%s calling the %s\n", name, sp);
    }
}
