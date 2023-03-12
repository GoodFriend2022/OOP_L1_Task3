package Task3;
// Подумать как описать логику взаимодействия человека и домашнего питомца. 
// Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается. 
// Какое ещё взаимодействие может быть?
public class Main {
    public static void main(String[] args) {
        Human victor = new Human("Виктор");
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Фроська");
        Dog dog1 = new Dog("Макс");
        Dog dog2 = new Dog("Буч");
        Dog dog3 = new Dog("Айя");

        FindModelAnimal modelAn = new FindModelAnimal();
        modelAn.getAnimals().add(cat1);
        modelAn.getAnimals().add(cat2);
        modelAn.getAnimals().add(cat3);
        modelAn.getAnimals().add(dog1);
        modelAn.getAnimals().add(dog2);
        modelAn.getAnimals().add(dog3);

        victor.walk(modelAn.findAnimal(dog1.getModel()));
        victor.feed(modelAn.getAnimals());

        System.out.println(victor.say());
        System.out.println(cat1.say());
        System.out.println(victor.kindness());
        System.out.println(dog1.kindness());
    }
}