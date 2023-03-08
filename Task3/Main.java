package Task3;
// Подумать как описать логику взаимодействия человека и домашнего питомца. 
// Сценарий: “Человек “зовёт” котика “кис-кис”, котик отзывается. 
// Какое ещё взаимодействие может быть?
public class Main {
    public static void main(String[] args) {
        Human victor = new Human("Victor");
        Cat cat = new Cat();
        Dog dog = new Dog();
        victor.pat(Species.dog);
        System.out.println(dog.caressed());
        victor.call(Species.cat);
        System.out.println(cat.sayAnimal());
    }
}