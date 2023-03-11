package Task3;
// Подумать как описать логику взаимодействия человека и домашнего питомца. 
// Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается. 
// Какое ещё взаимодействие может быть?
public class Main {
    public static void main(String[] args) {
        Human victor = new Human("Виктор");
        Cat cat = new Cat("Мурка");
        Dog dog = new Dog("Макс");
        System.out.println(victor.say(cat));
        System.out.println(cat.say(victor));
        System.out.println(victor.kindness(dog));
        System.out.println(dog.kindness(victor));
    }
}